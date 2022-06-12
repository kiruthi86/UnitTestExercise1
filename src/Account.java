public class Account {

    private Customer owner;
    private double interest;

    public Account(Customer owner){
        this.owner = owner;
        this.setInterest();
    }

    private void setInterest(){
        if(owner.getCreditScore() > 0.9){
            if (owner.getAge() > 35) {
                this.interest = 1.31;
            }else if(owner.getAge() > 25){
                this.interest = 1.21;
            }
            else if(owner.getAge() > 18){
                this.interest = 1.11;
            }
            else this.interest = 1.00;
        }
        else if (owner.getCreditScore() > 0.75){
            if (owner.getAge() > 35) {
                this.interest = 1.10;
            }else if(owner.getAge() > 25){
                this.interest = 1.09;
            }
            else if(owner.getAge() > 18){
                this.interest = 1.08;
            }
            else this.interest = 1.00;
        }
        else{
            this.interest = 1.00;
        }
    }

    public double getInterest(){
        return this.interest;
    }
}
