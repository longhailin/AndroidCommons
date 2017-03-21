package com.hiram.commons.util;

/**
 * Singleton helper class for lazily initialization.
 * 
 * 作者： hiram on 2017/3/23
 * 
 * @param <T>
 */
public abstract class SingletonUtils<T> {

    private T instance;

    protected abstract T newInstance();

    public final T getInstance() {
        if (instance == null) {
            synchronized (SingletonUtils.class) {
                if (instance == null) {
                    instance = newInstance();
                }
            }
        }
        return instance;
    }
}
