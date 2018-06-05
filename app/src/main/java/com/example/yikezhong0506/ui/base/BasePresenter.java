package com.example.yikezhong0506.ui.base;

import javax.inject.Inject;

public class BasePresenter<T extends BaseContract.BaseView> implements BaseContract.BasePresenter<T> {
    @Inject
    protected T mView;

    @Override
    public void attchView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        if (mView!=null){
            mView=null;
        }

    }
}
