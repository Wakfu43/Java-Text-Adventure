package textAdventure.itemSystem;

import textAdventure.magicSystem.Magic;

public class Item {
  private String name;
  private int buyPrice;
  private int sellPrice;
  private Magic magic;

  public Item(String name, int buyPrice, int sellPrice) {
    this.name = name;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public Item(String name, int buyPrice, int sellPrice, Magic magic) {
    this.name = name;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.magic = magic;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBuyPrice() {
    return buyPrice;
  }

  public void setBuyPrice(int buyPrice) {
    this.buyPrice = buyPrice;
  }

  public int getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(int sellPrice) {
    this.sellPrice = sellPrice;
  }

  public Magic getMagic() {
    return magic;
  }

  public void setMagic(Magic magic) {
    this.magic = magic;
  }
}