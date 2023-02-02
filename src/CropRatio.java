import java.util.HashMap;

public class CropRatio {
    private int totalWeight;
    private HashMap<String, Integer> crops = new HashMap<String, Integer>();

    public void add(String name, int cropWeight) {
        Integer currentCropWeight = crops.get(name);

        if (currentCropWeight == null) {
            crops.put(name, currentCropWeight);
        }

        cropWeight += cropWeight;
        totalWeight++;
    }

    public double proportion(String name) {
        return crops.getOrDefault(name,0) / totalWeight;
    }

}
