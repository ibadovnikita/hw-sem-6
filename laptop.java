public class Laptop {

    // марка ноутбука
    private String name;

    // ОЗУ ноутбука
    private Integer ram;

    // Жесткая память ноутбука
    private Integer hard_drive;

    // ОС ноутбука
    private String os_laptop;

    // цвет ноутбука
    private String color;

    // цена
    private Integer price;

    public String get_name(){
        return name;
    }

    public int get_ram(){
        return ram;
    }

    public int get_hard_drive(){
        return hard_drive;
    }

    public String get_os_laptop(){
        return os_laptop;
    }

    public String get_color(){
        return color;
    }

    public int get_price(){
        return price;
    }

    public Laptop(String name, int ram, int hard_drive, String os_laptop, String color, int price ){
        this.name=name;
        this.ram = ram;
        this.hard_drive = hard_drive;
        this.os_laptop = os_laptop;
        this.color = color;
        this.price = price;
    }



    public String toString(){
        return "name : "+name+"; ram : "+ram+"; hard_drive : "+hard_drive+"; os_laptop : "+os_laptop+"; color : "+color+"; price : "+price+"\n";
    }


    public boolean filter_name(String input){
        
        if(this.name.equals(input)){
            return true;
        }
        return false;
    }

    public boolean filter_ram_more(int input){
        
        if(this.ram >= input) {
            return true;
        }
        return false;
    }

    public boolean filter_ram_less(int input){

        
        
        if(this.ram < input) {
            return true;
        }
        return false;
    }

    public boolean filter_hard_drive_more(String input){
        
        if(this.hard_drive >= Integer.parseInt(input)) {
            return true;
        }
        return false;
    }

    public boolean filter_hard_drive_less(String input){
        
        if(this.hard_drive < Integer.parseInt(input)) {
            return true;
        }
        return false;
    }


    public boolean filter_price_more(String input){
        
        if(this.hard_drive >= Integer.parseInt(input)) {
            return true;
        }
        return false;
    }

    public boolean filter_price_less(String input){
        
        if(this.hard_drive < Integer.parseInt(input)) {
            return true;
        }
        return false;
    }

    public boolean filter_os_laptop(String input){
        
        if(this.os_laptop.equals(input)){
            return true;
        }
        return false;
    }

    public boolean filter_color(String input){
        
        if(this.color.equals(input)){
            return true;
        }
        return false;
    }












    
}