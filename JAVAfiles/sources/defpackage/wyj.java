package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wyj {
    public final Object a;
    public final Object b;
    public final Object c;

    public wyj(armf armfVar, armf armfVar2, Context context) {
        this.c = armfVar;
        this.a = armfVar2;
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final wyh a() {
        ogn ognVar = (ogn) this.b.b();
        ognVar.getClass();
        xii xiiVar = (xii) this.c.b();
        xiiVar.getClass();
        return new wyh(this.a, ognVar, xiiVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final Context b(Context context, int i) {
        context.getClass();
        int[] a = ((ycl) this.a.b()).a(i);
        int i2 = 0;
        int i3 = a[0];
        int i4 = a[1];
        Configuration configuration = new Configuration();
        if (i3 == 0) {
            if (i4 == 0) {
                Configuration configuration2 = context.getResources().getConfiguration();
                configuration.mcc = configuration2.mcc;
                configuration.mnc = configuration2.mnc;
                Context createConfigurationContext = context.createConfigurationContext(configuration);
                createConfigurationContext.getClass();
                return createConfigurationContext;
            }
        } else {
            i2 = i3;
        }
        configuration.mcc = i2;
        configuration.mnc = i4;
        Context createConfigurationContext2 = context.createConfigurationContext(configuration);
        createConfigurationContext2.getClass();
        return createConfigurationContext2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    public final Bundle c(int i, int i2) {
        try {
            XmlResourceParser xml = b((Context) this.b, i).getResources().getXml(i2);
            Bundle bundle = new Bundle();
            try {
                xau a = xau.a(xml, (yjr) this.c.b());
                a.a = new xbj(bundle, 0);
                a.b();
                armd.g(xml, null);
                return bundle;
            } finally {
            }
        } catch (Resources.NotFoundException e) {
            alvg alvgVar = (alvg) ((alvg) alvi.m("com/google/android/apps/messaging/shared/sms/config/ResourceCarrierConfigLoader").i()).g(e);
            alvgVar.X(alwp.a, "Bugle");
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/sms/config/ResourceCarrierConfigLoader", "loadFromResources", 45, "ResourceCarrierConfigLoader.kt")).q("Cannot find mms_config.xml:");
            return new Bundle();
        }
    }

    public final void d(xjl xjlVar) {
        xjlVar.getClass();
        ((lgg) this.b).g(new xet(5));
        g((lgg) this.b, new xih(4));
        g((lgg) this.a, new wyk(xjlVar, 10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final xjc e(BiConsumer biConsumer) {
        itw itwVar = (itw) this.b.b();
        itwVar.getClass();
        Executor executor = (Executor) this.c.b();
        executor.getClass();
        return new xjc(this.a, itwVar, executor, biConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    public final boolean f() {
        if (((yjr) this.a.b()).y() && ((yjf) this.c.b()).m() && yhx.h((Context) this.b)) {
            return true;
        }
        return false;
    }

    public final void g(lgg lggVar, arqr arqrVar) {
        lggVar.d(new uzn(this, arqrVar, 14, null));
    }

    public wyj(String str, String str2, String str3) {
        this.b = str;
        this.a = str2;
        this.c = str3;
    }

    public wyj(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public wyj(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public wyj(String str, Optional optional, List list) {
        xyl.k(!list.isEmpty());
        this.c = str;
        this.b = optional;
        this.a = list;
    }

    public wyj(Context context, armf armfVar, armf armfVar2) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.b = context;
        this.c = armfVar;
        this.a = armfVar2;
    }

    public wyj(lgg lggVar, lgg lggVar2, arwe arweVar) {
        lggVar.getClass();
        lggVar2.getClass();
        arweVar.getClass();
        this.b = lggVar;
        this.a = lggVar2;
        this.c = arweVar;
    }
}
