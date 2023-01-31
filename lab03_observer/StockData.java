import java.util.ArrayList;

public class StockData implements StockSubject{

    private ArrayList observers;
    private Double dow;
    private Double snp;
    private Double mmm;
    private Double msft;

    public StockData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(StockObserver o) {
        // TODO Auto-generated method stub

        observers.add(o);
        
    }

    @Override
    public void removeObserver(StockObserver o) {
        // TODO Auto-generated method stub

        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }

    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub

        for(int i = 0; i < observers.size(); i++){
            StockObserver observer = (StockObserver)observers.get(i);
            observer.update(dow, snp, mmm, msft);
        }
        
    }

    public void measurementsChanged(){
        notifyObservers();
    }
    
    public void setMeasurements(Double dow, Double snp, Double mmm, Double msft){
        this.dow = dow;
        this.snp = snp;
        this.mmm = mmm;
        this.msft = msft;
    }
}
