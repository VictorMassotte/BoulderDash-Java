package modelle;

/**
 * The World is a class in model
 * 
 * @author Victor Massotte
 *
 */

public class World {

	public Sprite sprite[][];
	public int xhero;
	public int yhero;
	public int nbdiamond;

	public int xmax;
	public int ymax;

	public int level;
	public boolean exit;

	private Sprite wall;
	private Sprite dirt;
	private Sprite diamond;
	private Sprite hero;
	private Sprite rock;
	private Sprite empty;

	// -----------------------------------------------------------------------------------------------------

	public World(String map, int nbdiamond, int level) {
		this.level = 1;
		this.level = level;
		this.nbdiamond = nbdiamond;
		this.xmax = 0;
		this.ymax = 1;

		this.wall = new Wall(this.level);
		this.dirt = new Dirt(this.level);
		this.diamond = new Diamond(this.level);
		this.hero = new Hero(this.level);
		this.empty = new Empty(this.level);
		this.rock = new Rock(this.level);

		for (int n = 0; map.charAt(n) != '$'; n++) {
			this.xmax++;
		}

		for (int n = 0; n < map.length(); n++) {
			if (map.charAt(n) == '$') {
				this.ymax++;
			}
		}

		this.sprite = new Sprite[this.ymax][this.xmax];

		exit = false;

		for (int n = 0; n < this.ymax; n++) {
			this.sprite[n][0] = this.wall;
			this.sprite[n][this.xmax - 1] = this.wall;
		}

		for (int i = 0; i < this.xmax; i++) {
			this.sprite[0][i] = this.wall;
			this.sprite[this.ymax - 1][i] = this.wall;
		}

		for (int n = 1; n < this.ymax - 1; n++) {
			for (int i = 1; i < this.xmax - 1; i++) {
				this.sprite[n][i] = this.dirt;
			}
		}

		int x = 0;
		int y = 0;

		for (int n = 0; n < map.length(); n++) {
			char c = map.charAt(n);

			if (c == '$') {
				y++;
				x -= this.xmax;
			} else {
				switch (c) {
				case 'X':
					this.sprite[y][x] = this.wall;
					break;

				case 'D':
					this.sprite[y][x] = this.diamond;
					break;

				case 'H':
					this.sprite[y][x] = this.dirt;
					break;

				case 'S':
					this.sprite[y][x] = this.hero;
					this.xhero = x;
					this.yhero = y;

				case 'O':
					this.sprite[y][x] = this.rock;

				}

				x++;

			}
		}

		this.sprite[1][1] = this.hero;
		this.xhero = 1;
		this.yhero = 1;

		this.sprite[14][30] = new FinalBlock(this.level);

	}

	// -----------------------------------------------------------------------------------------------------

	public void moveHero(String direction) {

		int x = 0;
		int y = 0;

		switch (direction) {
		case "UP":
			y = -1;
			break;

		case "RIGHT":
			x = 1;
			break;

		case "DOWN":
			y = 1;
			break;

		case "LEFT":
			x = -1;
			break;

		}

		this.sprite[yhero][xhero].setDirection(direction);

		if (this.sprite[yhero + y][xhero + x].getBreakable()) {
			if (this.sprite[yhero + y][xhero + x].getBreakable()) {
				if (nbdiamond > 0) {
					nbdiamond--;
				}
			}

			this.sprite[yhero + y][xhero + x] = this.sprite[yhero][xhero];
			this.sprite[yhero][xhero] = this.empty;
			this.yhero += y;
			this.xhero += x;

		} else {
			if (y == 0 && (this.sprite[yhero][xhero + x] instanceof Rock)) {
				if (this.sprite[yhero][xhero + x * 2] instanceof Empty) {
					this.sprite[yhero][xhero + x * 2] = this.sprite[yhero][xhero + x];
					this.sprite[yhero][xhero + x] = this.sprite[yhero][xhero];
					this.sprite[yhero][xhero] = empty;
					this.xhero += x;
				}

			} else {
				if (this.sprite[yhero + y][xhero + x] instanceof FinalBlock) {
					if (this.nbdiamond == 0) {
						System.out.println("You Win !!!");
						this.sprite[yhero][xhero].setDirection("WIN");
						exit = true;
					}
				}
			}

		}

	}

	// -----------------------------------------------------------------------------------------------------

	public void update() {
		for (int n = this.ymax - 1; n >= 0; n--) {
			for (int i = this.xmax - 1; i >= 0; i--) {
				if ((this.sprite[n][i] instanceof Empty) || (this.sprite[n][i] instanceof Hero)) {
					updateEmpty(i, n);
				}
			}
		}

		for (int n = this.ymax - 1; n >= 0; n--) {
			for (int i = this.xmax - 1; i >= 0; i--) {
				if (this.sprite[n][i].getFall()) {
					this.sprite[n][i].setUpdate(false);

				}

			}

		}

	}

	// -----------------------------------------------------------------------------------------------------

	private void updateEmpty(int x, int y) {

		if (this.sprite[y - 1][x].getFall() && !this.sprite[y - 1][x].getUpdate()) {
			this.updatefall(x, y - 1);
		}

		if (this.sprite[y - 1][x - 1].getFall() && !this.sprite[y - 1][x - 1].getUpdate()) {
			this.updatefall(x - 1, y - 1);
		}

		if (this.sprite[y - 1][x + 1].getFall() && !this.sprite[y - 1][x + 1].getUpdate()) {
			this.updatefall(x + 1, y - 1);
		}

	}

	// -----------------------------------------------------------------------------------------------------

	private void updatefall(int x, int y) {
		this.sprite[y][x].setUpdate(true);

		if (move(x, y, "DOWN")) {
			this.sprite[y + 1][x].setFalling(true);
			return;
		}

		if (this.sprite[y + 1][x].getFall() || this.sprite[y + 1][x] instanceof Wall) {
			if (this.sprite[y][x - 1] instanceof Empty) {
				if (move(x, y, x - 1, y + 1)) {
					this.sprite[y + 1][x - 1].setFalling(true);
					return;

				}

			}

		}

		if (this.sprite[y][x + 1] instanceof Empty) {
			if (move(x, y, x + 1, y + 1)) {
				this.sprite[y + 1][x + 1].setFalling(true);
				return;

			}

		}

		if ((this.sprite[y + 1][x] instanceof Hero) && (this.sprite[y][x].getFalling())) {
			System.out.println("The rock fell on the hero");
			this.sprite[y + 1][x].setDirection("DEATH");
			exit = true;
			return;
		}

		this.sprite[y][x].setFalling(false);

	}

	// -----------------------------------------------------------------------------------------------------

	private boolean move(int x1, int y1, int x2, int y2) {
		if (this.sprite[y2][x2] instanceof Empty) {
			this.sprite[y2][x2] = this.sprite[y1][x1];
			this.sprite[y1][x1] = empty;
			if (y2 < y1) {
				this.sprite[y2][x2].setDirection("UP");
			} else {
				this.sprite[y2][x2].setDirection("DOWN");
			}
			if (x2 < x1) {
				this.sprite[y2][x2].setDirection("LEFT");
			} else {
				this.sprite[y2][x2].setDirection("RIGHT");
			}

			return true;
		}
		return false;
	}

	// -----------------------------------------------------------------------------------------------------

	private boolean move(int x, int y, String direction) {
		switch (direction) {
		case "UP":
			if (this.sprite[y - 1][x] instanceof Empty) {
				this.sprite[y - 1][x] = this.sprite[y][x];
				this.sprite[y][x] = empty;
				this.sprite[y - 1][x].setDirection(direction);
				return true;
			}
			break;
		case "DOWN":
			if (this.sprite[y + 1][x] instanceof Empty) {
				this.sprite[y + 1][x] = this.sprite[y][x];
				this.sprite[y][x] = empty;
				this.sprite[y + 1][x].setDirection(direction);
				return true;
			}
			break;
		case "LEFT":
			if (this.sprite[y][x - 1] instanceof Empty) {
				this.sprite[y][x - 1] = this.sprite[y][x];
				this.sprite[y][x] = empty;
				this.sprite[y][x - 1].setDirection(direction);
				return true;
			}
			break;
		case "RIGHT":
			if (this.sprite[y][x + 1] instanceof Empty) {
				this.sprite[y][x + 1] = this.sprite[y][x];
				this.sprite[y][x] = empty;
				this.sprite[y][x + 1].setDirection(direction);
				return true;
			}
			break;
		}
		return false;
	}

	// ----------------------------------------------------------------------------------------------------------------
}
