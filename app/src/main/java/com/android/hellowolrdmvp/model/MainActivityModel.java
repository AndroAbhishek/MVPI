package com.android.hellowolrdmvp.model;

import com.android.hellowolrdmvp.contract.MainActivityContract;
import com.android.hellowolrdmvp.contract.MainActivityContract.Presenter;

/**
 * Created by AbhishekSharma on 20/09/17.
 */

public class MainActivityModel implements MainActivityContract.Model {

  @Override
  public String getData() {
    return "Hello people welcome to MVP";
  }
}
