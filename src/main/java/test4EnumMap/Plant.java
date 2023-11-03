package test4EnumMap;

/**
 * @author by woyuan  2023/3/12
 */
class Plant {
    final String name;
    final LifeCycle lifeCycle;
    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

    enum LifeCycle {ANNUAL, PERENNIAL, BIENNIAL}
}
