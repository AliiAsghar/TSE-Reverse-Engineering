package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.aode;
import defpackage.aodi;
import defpackage.aodq;
import defpackage.aoel;
import defpackage.aoem;
import defpackage.aoen;
import defpackage.aoev;
import defpackage.aofg;
import defpackage.aofs;
import defpackage.aogo;
import defpackage.aogp;
import defpackage.aogr;
import defpackage.aogs;
import defpackage.aojk;
import defpackage.aojl;
import defpackage.aojm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<aoen<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        aoem b = aoen.b(aojm.class);
        final int i = 2;
        final int i2 = 0;
        b.b(new aoev(aojk.class, 2, 0));
        b.c = new aofs(11);
        arrayList.add(b.a());
        aofg aofgVar = new aofg(aodq.class, Executor.class);
        final int i3 = 1;
        aoem aoemVar = new aoem(aogo.class, aogr.class, aogs.class);
        aoemVar.b(new aoev(Context.class, 1, 0));
        aoemVar.b(new aoev(aodi.class, 1, 0));
        aoemVar.b(new aoev(aogp.class, 2, 0));
        aoemVar.b(new aoev(aojm.class, 1, 1));
        aoemVar.b(new aoev(aofgVar, 1, 0));
        aoemVar.c = new aoel(aofgVar, i);
        arrayList.add(aoemVar.a());
        arrayList.add(aode.ad("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(aode.ad("fire-core", "21.0.0_1p"));
        arrayList.add(aode.ad("device-name", a(Build.PRODUCT)));
        arrayList.add(aode.ad("device-model", a(Build.DEVICE)));
        arrayList.add(aode.ad("device-brand", a(Build.BRAND)));
        arrayList.add(aode.ae("android-target-sdk", new aojl() { // from class: aodk
            @Override // defpackage.aojl
            public final String a(Object obj) {
                int i4;
                int i5 = i3;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            Context context = (Context) obj;
                            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                            if (installerPackageName == null) {
                                return "";
                            }
                            return FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        Context context2 = (Context) obj;
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            return "tv";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            return "watch";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            return "auto";
                        }
                        if (!context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            return "";
                        }
                        return "embedded";
                    }
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    if (applicationInfo == null) {
                        return "";
                    }
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                if (applicationInfo2 != null) {
                    i4 = applicationInfo2.minSdkVersion;
                    return String.valueOf(i4);
                }
                return "";
            }
        }));
        arrayList.add(aode.ae("android-min-sdk", new aojl() { // from class: aodk
            @Override // defpackage.aojl
            public final String a(Object obj) {
                int i4;
                int i5 = i2;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            Context context = (Context) obj;
                            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                            if (installerPackageName == null) {
                                return "";
                            }
                            return FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        Context context2 = (Context) obj;
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            return "tv";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            return "watch";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            return "auto";
                        }
                        if (!context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            return "";
                        }
                        return "embedded";
                    }
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    if (applicationInfo == null) {
                        return "";
                    }
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                if (applicationInfo2 != null) {
                    i4 = applicationInfo2.minSdkVersion;
                    return String.valueOf(i4);
                }
                return "";
            }
        }));
        arrayList.add(aode.ae("android-platform", new aojl() { // from class: aodk
            @Override // defpackage.aojl
            public final String a(Object obj) {
                int i4;
                int i5 = i;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            Context context = (Context) obj;
                            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                            if (installerPackageName == null) {
                                return "";
                            }
                            return FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        Context context2 = (Context) obj;
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            return "tv";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            return "watch";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            return "auto";
                        }
                        if (!context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            return "";
                        }
                        return "embedded";
                    }
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    if (applicationInfo == null) {
                        return "";
                    }
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                if (applicationInfo2 != null) {
                    i4 = applicationInfo2.minSdkVersion;
                    return String.valueOf(i4);
                }
                return "";
            }
        }));
        final int i4 = 3;
        arrayList.add(aode.ae("android-installer", new aojl() { // from class: aodk
            @Override // defpackage.aojl
            public final String a(Object obj) {
                int i42;
                int i5 = i4;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            Context context = (Context) obj;
                            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                            if (installerPackageName == null) {
                                return "";
                            }
                            return FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        Context context2 = (Context) obj;
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            return "tv";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            return "watch";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            return "auto";
                        }
                        if (!context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            return "";
                        }
                        return "embedded";
                    }
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    if (applicationInfo == null) {
                        return "";
                    }
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                if (applicationInfo2 != null) {
                    i42 = applicationInfo2.minSdkVersion;
                    return String.valueOf(i42);
                }
                return "";
            }
        }));
        return arrayList;
    }
}
