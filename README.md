# Dagger 2 Example

This is a simple example of setting up Dagger 2 in a Android application.  The example exhibits the use of different components with a shared subset of modules.  For example, ```CommandSimple``` is provided via ```CommandModule``` which can be included in different ```Components```, in this case only ```SubActivityComponent``` is doing so though.  ModelOne is provided in both ```SubActivityComponent``` and ```ActvityComponent``` Since each are scoped the same, yet included in different componets, we actually have two different instances.  That said, bit ```SecondActivity``` and ```ThirdActivity``` share an instance.

