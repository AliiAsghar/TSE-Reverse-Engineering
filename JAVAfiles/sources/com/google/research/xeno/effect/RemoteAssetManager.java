package com.google.research.xeno.effect;

import defpackage.arbj;
import java.util.HashMap;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RemoteAssetManager {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface FetchCallback {
        void onCompletion(String str, String str2);
    }

    static {
        new HashMap();
        arbj arbjVar = new arbj((char[]) null, (byte[]) null);
        arbjVar.j("xeno-remote-asset-manager-thread-%d");
        Executors.newSingleThreadExecutor(arbj.t(arbjVar));
    }

    private static native long nativeCreateRemoteAssetManager(String str, long j, AssetDownloader assetDownloader, String str2);
}
