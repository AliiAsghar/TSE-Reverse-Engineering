package com.google.android.ims.provisioning.config;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CapabilityConfiguration implements Serializable {
    private static final long serialVersionUID = 1927319064737204467L;
    public boolean disableInitialAddressBookScan;
    public boolean mPresenceDiscovery;
    public int mPollingPeriod = 0;
    public int mCapInfoExpiry = 0;
    public int mNonRcsCapInfoExpiry = 0;
    public int msgCapValidity = 0;
}
