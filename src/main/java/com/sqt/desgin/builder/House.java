package com.sqt.desgin.builder;

import lombok.Getter;
import lombok.Setter;

/** 房子类 建造者
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-28 0:33
 */
@Setter
@Getter
public class House {

    private String houseName;
    private String houseAddress;
    private String houseSize;
    private String houseShape;

    public House(HouseBuilder HouseBuilder){
        this.houseName = HouseBuilder.houseName;
        this.houseAddress = HouseBuilder.houseAddress;
        this.houseSize = HouseBuilder.houseSize;
        this.houseShape = HouseBuilder.houseShape;
    }

    public House() {
    }

    @Override
    public String toString() {
        return "House{" +
                "houseName='" + houseName + '\'' +
                ", houseAddress='" + houseAddress + '\'' +
                ", houseSize='" + houseSize + '\'' +
                ", houseShape='" + houseShape + '\'' +
                '}';
    }

    public static class HouseBuilder{
        private String houseName;
        private String houseAddress;
        private String houseSize;
        private String houseShape;

        public HouseBuilder houseNameBuilder(String houseName){
            this.houseName = houseName;
            return this;
        }
        public HouseBuilder houseAddressBuilder(String houseAddress){
            this.houseAddress = houseAddress;
            return this;
        }
        public HouseBuilder houseSizeBuilder(String houseSize){
            this.houseSize = houseSize;
            return this;
        }
        public HouseBuilder houseShapeBuilder(String houseShape){
            this.houseShape = houseShape;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }




}
