package prototype_design_pattern;
//Renklerin klonlandığı abstract sınıfıdır. Bu sınıf Cloneable interface sınıfını implement etmektedir.
    abstract class Color implements Cloneable
    {

        protected String colorName;

        abstract void addColor();

        public Object clone()
        {
            Object clone = null;
            try
            {
                clone = super.clone();
            }
            catch (CloneNotSupportedException e)
            {
                e.printStackTrace();
            }
            return clone;
        }
    }

