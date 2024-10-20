package defpackage;

import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class advg {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NetworkInfo.DetailedState.values().length];
        a = iArr;
        try {
            iArr[NetworkInfo.DetailedState.AUTHENTICATING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[NetworkInfo.DetailedState.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[NetworkInfo.DetailedState.CONNECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[NetworkInfo.DetailedState.CONNECTING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[NetworkInfo.DetailedState.DISCONNECTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[NetworkInfo.DetailedState.DISCONNECTING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[NetworkInfo.DetailedState.FAILED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[NetworkInfo.DetailedState.IDLE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[NetworkInfo.DetailedState.SCANNING.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[NetworkInfo.DetailedState.SUSPENDED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            a[NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
    }
}
