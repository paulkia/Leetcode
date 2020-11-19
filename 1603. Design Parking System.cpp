class ParkingSystem {
public:
    int big, med, sml;
    ParkingSystem(int big, int medium, int small) {
        this->big = big;
        this->med = medium;
        this->sml = small;
    }
    
    bool addCar(int carType) {
        if (carType == 1) {
            return this->big-- > 0;
        } if (carType == 2) {
            return this->med-- > 0;
        } return this->sml-- > 0;
    }
};

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem* obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj->addCar(carType);
 */