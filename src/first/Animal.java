package first;

public class Animal<V extends Voice, A extends Action> implements ObjectsWithGroupingAndBehavior {
    private String name;
    private V voice;
    private A action;

    public Animal(String name, V voice, A action) {
        this.name = name;
        this.voice = voice;
        this.action = action;
    }

    String getDescription() {
        return name + " says " + voice.animalVoice() + " and " + action.animalAction();
    }

    @Override
    public Object getGroup() {
        return voice;
    }

    @Override
    public Object getBehavior() {
        return action;
    }
}
