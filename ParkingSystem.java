import java.util.ArrayList;

public class ParkingSystem implements IParking{
	int[] count = new int[3];
	public ParkingSystem(Integer big, Integer medium, Integer small) {
		// ��ʼ��ParkingSystem�࣬���������ֱ��Ӧÿ��ͣ��λ����Ŀ
		count[0] = big;
        count[1] = medium;
        count[2] = small;
	}

	public void print(String string, int carType) {
		
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(text);
	}
	public void addCar() {
		// ����Ƿ���carType��Ӧ��ͣ��λ
		
		
	}

	
	public boolean addCar(int carType) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean addCar(Integer carType) {
		if(count[carType - 1] > 0)  {
            count[carType - 1]--;
            return true;
        }
		return false;
	}
	
	boolean addCar1(Integer carType) {
        boolean isSucc = false;  //ͣ��ͣ����
        switch (carType)
        {
        case 1:
            if (carType > 0) {
            	carType--;
                isSucc = true;
            }
            break;
        case 2:
            if (carType > 0) {
                carType--;
                isSucc = true;
            }
            break;
        case 3:
            if (carType > 0) {
                carType--;
                isSucc = true;
            }
            break;
        default:
            print("unknow cartype:%d", carType);
            break;
        }
        return isSucc;
    }
	public static void main(String[] args) throws Exception{
		IParams params=IParking.parse();
		//ParkingSystem.parse();
		
		ParkingSystem ps=new ParkingSystem(params.getBig(),params.getMedium(),params.getSmall());
		
		ArrayList<Integer>plan=params.getPlanParking();
		
		for(int i=0;i<plan.size();i++) {
			ps.addCar(plan.get(i));
		}
		ps.print();
	}

	

	

	

	

	
	

}
