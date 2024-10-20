package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.View;
import android.view.WindowMetrics;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.ActivityStackAttributes;
import androidx.window.extensions.embedding.ActivityStackAttributesCalculatorParams;
import androidx.window.extensions.embedding.ParentContainerInfo;
import androidx.window.extensions.embedding.WindowAttributes;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.dbu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqg {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gqg(Context context, gxg gxgVar, gxb gxbVar, gxg gxgVar2, gxg gxgVar3) {
        this.e = context;
        this.a = gxgVar;
        this.d = gxbVar;
        this.c = gxgVar2;
        this.b = gxgVar3;
    }

    private final void n(gs gsVar) {
        byte[] l = gsVar.l();
        if (l != null) {
            ((vl) this.b).put(new String(l), gsVar);
        }
        byte[] m = gsVar.m();
        if (m != null) {
            ((vl) this.e).put(new String(m), gsVar);
        }
        byte[] p = gsVar.p();
        if (p != null) {
            ((vl) this.c).put(new String(p), gsVar);
        }
        byte[] o = gsVar.o();
        if (o != null) {
            ((vl) this.d).put(new String(o), gsVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [armf, java.lang.Object] */
    public final iqj a(amqh amqhVar, se seVar, arqg arqgVar, iqh iqhVar) {
        Activity activity = (Activity) this.a.b();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        uvi uviVar = (uvi) this.d.b();
        uviVar.getClass();
        arwe arweVar = (arwe) this.c.b();
        arweVar.getClass();
        amqhVar.getClass();
        return new iqj(activity, xnvVar, uviVar, arweVar, amqhVar, seVar, arqgVar, iqhVar);
    }

    public final int b() {
        return d().a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cas, java.lang.Object] */
    public final fzu c() {
        return (fzu) this.e.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cas, java.lang.Object] */
    public final gaq d() {
        return (gaq) this.b.a();
    }

    public final Object e(arpe arpeVar) {
        Object a = new aghw(((gcz) this.c).h, 11).a(new gbw(this, 2), arpeVar);
        if (a == arpl.a) {
            return a;
        }
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [asai, java.lang.Object] */
    public final Object f(arpe arpeVar) {
        Object q = armd.q(this.a, new eig(this, (arpe) null, 5), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    public final Object g(int i) {
        ((gcz) this.c).c(i);
        return d().get(i);
    }

    public final Object h(int i) {
        return d().get(i);
    }

    public final int i() {
        return ((Vector) this.a).size();
    }

    public final gs j(int i) {
        return (gs) ((Vector) this.a).get(i);
    }

    public final void k(gs gsVar) {
        gsVar.getClass();
        n(gsVar);
        ((Vector) this.a).add(0, gsVar);
    }

    public final void l(gs gsVar) {
        gsVar.getClass();
        n(gsVar);
        ((Vector) this.a).add(gsVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    public final rtl m(Uri uri) {
        Context context = (Context) this.d.b();
        context.getClass();
        lrf lrfVar = (lrf) this.a.b();
        lrfVar.getClass();
        xvc xvcVar = (xvc) this.e.b();
        xvcVar.getClass();
        uga ugaVar = (uga) this.c.b();
        ugaVar.getClass();
        uli uliVar = (uli) this.b.b();
        uliVar.getClass();
        return new rtl(context, lrfVar, xvcVar, ugaVar, uliVar, uri);
    }

    public gqg() {
        this.a = new Vector();
        this.b = new vl();
        this.e = new vl();
        this.c = new vl();
        this.d = new vl();
    }

    public gqg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
    }

    public gqg(View view) {
        this.c = (TextView) view.findViewById(R.id.text1);
        this.a = (TextView) view.findViewById(R.id.text2);
        this.b = (ImageView) view.findViewById(R.id.icon1);
        this.e = (ImageView) view.findViewById(R.id.icon2);
        this.d = (ImageView) view.findViewById(com.google.android.apps.messaging.R.id.edit_query);
    }

    public gqg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.e = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
    }

    public gqg(asai asaiVar, arwe arweVar) {
        this.b = new arrt((byte[]) null, (byte[]) null, (byte[]) null);
        ascc d = asck.d(1, Integer.MAX_VALUE, 1);
        this.d = d;
        this.a = new asdd(d, new fzo(this, (arpe) null, 0));
        arxm J = arrn.J(arweVar, null, arwf.b, new gbv(asaiVar, this, (arpe) null, 1), 1);
        J.s(new rh(this, 12));
        this.e = J;
        this.c = new asaa(new eig(this, (arpe) null, 3, (byte[]) null));
    }

    public gqg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.b = new rlm(7);
        a.a = "message_replies_backup.message_id";
        a.c = new wsy();
        rmk rmkVar = new rmk(a.a());
        this.a = rmkVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new rlm(8);
        a2.a = "message_replies_backup.replied_to_message_id";
        a2.c = new wsy();
        rmk rmkVar2 = new rmk(a2.a());
        this.b = rmkVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.a = "message_replies_backup.replied_to_message_id_null_reason";
        a3.c = new wsy();
        rmk rmkVar3 = new rmk(a3.a());
        this.e = rmkVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.c(true);
        a4.a = "message_replies_backup.replied_to_rcs_message_id";
        a4.c = new wsy();
        rmk rmkVar4 = new rmk(a4.a());
        this.d = rmkVar4;
        this.c = new rmk[]{rmkVar, rmkVar2, rmkVar3, rmkVar4};
    }

    public gqg(asai asaiVar) {
        this.a = asaiVar;
        arml armlVar = dbu.a;
        arpi a = dbu.a.a();
        this.d = a;
        geh gehVar = new geh(this, a, asaiVar instanceof ascg ? (gpx) aqjn.Z(((ascg) asaiVar).d()) : null);
        this.c = gehVar;
        this.b = new byu(gehVar.b(), cav.a);
        fzu fzuVar = (fzu) gehVar.h.c();
        if (fzuVar == null) {
            gaz gazVar = gei.a.b;
            gba gbaVar = gei.a;
            fzuVar = new fzu(gazVar, gbaVar.c, gbaVar.d, gbaVar);
        }
        this.e = new byu(fzuVar, cav.a);
    }

    public gqg(ActivityEmbeddingComponent activityEmbeddingComponent) {
        activityEmbeddingComponent.getClass();
        this.a = activityEmbeddingComponent;
        this.b = new ReentrantLock();
        this.c = new ArrayMap();
        this.d = new ArrayMap();
        this.e = new ArrayMap();
        new ArrayMap();
        new xzg((byte[]) null).a(8);
        activityEmbeddingComponent.setActivityStackAttributesCalculator(new Function() { // from class: gqe
            /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
            @Override // androidx.window.extensions.core.util.function.Function
            public final Object apply(Object obj) {
                ParentContainerInfo parentContainerInfo;
                Configuration configuration;
                WindowMetrics windowMetrics;
                WindowMetrics windowMetrics2;
                String activityStackTag;
                Bundle launchOptions;
                gpt gptVar;
                gqd gqdVar;
                ParentContainerInfo parentContainerInfo2;
                WindowMetrics windowMetrics3;
                ParentContainerInfo parentContainerInfo3;
                Configuration configuration2;
                WindowLayoutInfo windowLayoutInfo;
                Bundle launchOptions2;
                Configuration configuration3;
                Configuration configuration4;
                WindowMetrics windowMetrics4;
                WindowMetrics windowMetrics5;
                WindowLayoutInfo windowLayoutInfo2;
                gps gpsVar;
                gps gpsVar2;
                Object obj2;
                int i;
                Object obj3;
                int i2;
                int i3;
                int i4;
                gon aS;
                ActivityStackAttributes.Builder relativeBounds;
                ActivityStackAttributes.Builder windowAttributes;
                ActivityStackAttributes build;
                ActivityStackAttributesCalculatorParams m468m = ry$$ExternalSyntheticApiModelOutline0.m468m(obj);
                gqg gqgVar = gqg.this;
                gqgVar.getClass();
                ?? r3 = gqgVar.b;
                r3.lock();
                try {
                    parentContainerInfo = m468m.getParentContainerInfo();
                    parentContainerInfo.getClass();
                    gru aH = gvf.aH();
                    configuration = parentContainerInfo.getConfiguration();
                    configuration.getClass();
                    windowMetrics = parentContainerInfo.getWindowMetrics();
                    windowMetrics.getClass();
                    float b = aH.b(configuration, windowMetrics);
                    grb grbVar = grc.a;
                    windowMetrics2 = parentContainerInfo.getWindowMetrics();
                    windowMetrics2.getClass();
                    gra a = grbVar.a(windowMetrics2, b);
                    activityStackTag = m468m.getActivityStackTag();
                    activityStackTag.getClass();
                    launchOptions = m468m.getLaunchOptions();
                    launchOptions.getClass();
                    Bundle bundle = launchOptions.getBundle("androidx.window.embedding.EmbeddingBounds");
                    if (bundle == null) {
                        gptVar = null;
                    } else {
                        gptVar = new gpt(new gpp(bundle.getInt("androidx.window.embedding.EmbeddingBounds.alignment")), gvf.aX(bundle, "androidx.window.embedding.EmbeddingBounds.width"), gvf.aX(bundle, "androidx.window.embedding.EmbeddingBounds.height"));
                    }
                    if (gptVar == null) {
                        gqdVar = null;
                    } else {
                        gqdVar = new gqd(gptVar);
                    }
                    grb grbVar2 = grc.a;
                    parentContainerInfo2 = m468m.getParentContainerInfo();
                    windowMetrics3 = parentContainerInfo2.getWindowMetrics();
                    windowMetrics3.getClass();
                    grbVar2.a(windowMetrics3, b);
                    parentContainerInfo3 = m468m.getParentContainerInfo();
                    configuration2 = parentContainerInfo3.getConfiguration();
                    configuration2.getClass();
                    windowLayoutInfo = parentContainerInfo.getWindowLayoutInfo();
                    windowLayoutInfo.getClass();
                    gvf.aN(a, windowLayoutInfo);
                    gqd gqdVar2 = (gqd) gqgVar.c.get(activityStackTag);
                    if (gqdVar2 == null) {
                        if (gqdVar == null) {
                            throw new IllegalArgumentException("Can't retrieve overlay attributes from launch options");
                        }
                    } else {
                        gqdVar = gqdVar2;
                    }
                    ?? r5 = gqgVar.b;
                    r5.lock();
                    r5.unlock();
                    gqgVar.d.put(activityStackTag, gqdVar);
                    launchOptions2 = m468m.getLaunchOptions();
                    launchOptions2.getClass();
                    launchOptions2.putInt("androidx.window.embedding.ActivityStackAlignment", gqdVar.a.b.e);
                    ActivityStackAttributes.Builder builder = new ActivityStackAttributes.Builder();
                    gpt gptVar2 = gqdVar.a;
                    configuration3 = parentContainerInfo.getConfiguration();
                    configuration3.getClass();
                    gru aH2 = gvf.aH();
                    configuration4 = parentContainerInfo.getConfiguration();
                    configuration4.getClass();
                    windowMetrics4 = parentContainerInfo.getWindowMetrics();
                    windowMetrics4.getClass();
                    float b2 = aH2.b(configuration4, windowMetrics4);
                    grb grbVar3 = grc.a;
                    windowMetrics5 = parentContainerInfo.getWindowMetrics();
                    windowMetrics5.getClass();
                    gra a2 = grbVar3.a(windowMetrics5, b2);
                    gon gonVar = new gon(a2.a());
                    windowLayoutInfo2 = parentContainerInfo.getWindowLayoutInfo();
                    windowLayoutInfo2.getClass();
                    gqh gqhVar = new gqh(gonVar, gvf.aN(a2, windowLayoutInfo2), a2.a, configuration3, b2);
                    gon gonVar2 = gqhVar.a;
                    gqz gqzVar = gqhVar.b;
                    int i5 = 2;
                    if (d.F(gptVar2.c, gps.b) && d.F(gptVar2.d, gps.b)) {
                        aS = gon.a;
                    } else {
                        if (gptVar2.b(gqzVar)) {
                            gpsVar = new gpr(0.5f);
                        } else {
                            gpsVar = gptVar2.c;
                        }
                        if (gptVar2.a(gqzVar)) {
                            gpsVar2 = new gpr(0.5f);
                        } else {
                            gpsVar2 = gptVar2.d;
                        }
                        gpt gptVar3 = new gpt(gptVar2.b, gpsVar, gpsVar2);
                        int b3 = gonVar2.b();
                        if (gptVar3.b(gqzVar)) {
                            obj2 = new gpr(0.5f);
                        } else {
                            obj2 = gptVar3.c;
                        }
                        if (obj2 instanceof gpr) {
                            i = ((gpr) obj2).a(b3);
                        } else if (obj2 instanceof gpq) {
                            i = Math.min(b3, ((gpq) obj2).a);
                        } else if (d.F(obj2, gps.c)) {
                            gqt c = gpt.c(gqzVar);
                            c.getClass();
                            Rect a3 = c.a();
                            gpp gppVar = gptVar3.b;
                            if (d.F(gppVar, gpp.a)) {
                                i = a3.left - gonVar2.b;
                            } else if (d.F(gppVar, gpp.c)) {
                                i = gonVar2.d - a3.right;
                            } else {
                                throw new IllegalStateException("Unhandled condition to get height in pixel! embeddingBounds=" + gptVar3 + " taskBounds=" + gonVar2 + " windowLayoutInfo=" + gqzVar);
                            }
                        } else {
                            gps gpsVar3 = gptVar3.c;
                            Objects.toString(gpsVar3);
                            throw new IllegalArgumentException("Unhandled width dimension=".concat(gpsVar3.toString()));
                        }
                        int a4 = gonVar2.a();
                        if (gptVar3.a(gqzVar)) {
                            obj3 = new gpr(0.5f);
                        } else {
                            obj3 = gptVar3.d;
                        }
                        if (obj3 instanceof gpr) {
                            i4 = ((gpr) obj3).a(a4);
                        } else if (obj3 instanceof gpq) {
                            i4 = Math.min(a4, ((gpq) obj3).a);
                        } else if (d.F(obj3, gps.c)) {
                            gqt c2 = gpt.c(gqzVar);
                            c2.getClass();
                            Rect a5 = c2.a();
                            gpp gppVar2 = gptVar3.b;
                            if (d.F(gppVar2, gpp.b)) {
                                i2 = a5.top;
                                i3 = gonVar2.c;
                            } else if (d.F(gppVar2, gpp.d)) {
                                i2 = gonVar2.e;
                                i3 = a5.bottom;
                            } else {
                                throw new IllegalStateException("Unhandled condition to get height in pixel! embeddingBounds=" + gptVar3 + " taskBounds=" + gonVar2 + " windowLayoutInfo=" + gqzVar);
                            }
                            i4 = i2 - i3;
                        } else {
                            gps gpsVar4 = gptVar3.c;
                            Objects.toString(gpsVar4);
                            throw new IllegalArgumentException("Unhandled width dimension=".concat(gpsVar4.toString()));
                        }
                        int b4 = gonVar2.b();
                        int a6 = gonVar2.a();
                        if (i == b4 && i4 == a6) {
                            aS = gon.a;
                        } else {
                            gon gonVar3 = new gon(0, 0, i, i4);
                            gpp gppVar3 = gptVar2.b;
                            if (d.F(gppVar3, gpp.b)) {
                                aS = gvf.aS(gonVar3, (b4 - i) / 2, 0);
                            } else if (d.F(gppVar3, gpp.a)) {
                                aS = gvf.aS(gonVar3, 0, (a6 - i4) / 2);
                            } else if (d.F(gppVar3, gpp.d)) {
                                aS = gvf.aS(gonVar3, (b4 - i) / 2, a6 - i4);
                            } else if (d.F(gppVar3, gpp.c)) {
                                aS = gvf.aS(gonVar3, b4 - i, (a6 - i4) / 2);
                            } else {
                                gpp gppVar4 = gptVar2.b;
                                Objects.toString(gppVar4);
                                throw new IllegalArgumentException("Unknown alignment: ".concat(gppVar4.toString()));
                            }
                        }
                    }
                    relativeBounds = builder.setRelativeBounds(aS.c());
                    new xzg((byte[]) null).a(5);
                    if (true == d.F(null, gpy.a)) {
                        i5 = 1;
                    }
                    windowAttributes = relativeBounds.setWindowAttributes(new WindowAttributes(i5));
                    build = windowAttributes.build();
                    build.getClass();
                    return build;
                } finally {
                    r3.unlock();
                }
            }
        });
        activityEmbeddingComponent.registerActivityStackCallback(new sp(7), new Consumer() { // from class: gqf
            /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Map, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, androidx.window.extensions.embedding.ActivityEmbeddingComponent] */
            @Override // androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                ActivityStack.Token activityStackToken;
                String tag;
                String tag2;
                gqg gqgVar = gqg.this;
                List list = (List) obj;
                gqgVar.getClass();
                ?? r1 = gqgVar.b;
                r1.lock();
                try {
                    Set<String> keySet = ((ArrayMap) gqgVar.e).keySet();
                    keySet.getClass();
                    ((ArrayMap) gqgVar.e).clear();
                    ?? r3 = gqgVar.e;
                    list.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        tag2 = ry$$ExternalSyntheticApiModelOutline0.m467m(obj2).getTag();
                        if (tag2 != null) {
                            arrayList.add(obj2);
                        }
                    }
                    List ax = aqjn.ax(arrayList);
                    ArrayList arrayList2 = new ArrayList(aqjn.J(ax, 10));
                    Iterator it = ax.iterator();
                    while (it.hasNext()) {
                        ActivityStack m467m = ry$$ExternalSyntheticApiModelOutline0.m467m(it.next());
                        tag = m467m.getTag();
                        tag.getClass();
                        arrayList2.add(new armo(tag, m467m));
                    }
                    aqjn.t(r3, arrayList2);
                    if (!keySet.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        Set keySet2 = ((ArrayMap) gqgVar.e).keySet();
                        keySet2.getClass();
                        for (String str : keySet) {
                            if (!keySet2.contains(str)) {
                                activityStackToken = gqgVar.a.getActivityStackToken(str);
                                if (activityStackToken == null) {
                                    arrayList3.add(str);
                                }
                            }
                        }
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            String str2 = (String) arrayList3.get(i);
                            gqgVar.c.remove(str2);
                            ((ArrayMap) gqgVar.d).remove(str2);
                        }
                    }
                } finally {
                    r1.unlock();
                }
            }
        });
    }

    public gqg(short[] sArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.a = "my_identities_backup.token";
        a.c = new wsy();
        rok rokVar = new rok(a.a());
        this.d = rokVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.a = "my_identities_backup.address_type";
        a2.c = new wsy();
        rok rokVar2 = new rok(a2.a());
        this.b = rokVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "my_identities_backup.phone_number";
        a3.c = new wsy();
        rok rokVar3 = new rok(a3.a());
        this.a = rokVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "my_identities_backup.display_name";
        a4.c = new wsy();
        rok rokVar4 = new rok(a4.a());
        this.e = rokVar4;
        this.c = new rok[]{rokVar, rokVar2, rokVar3, rokVar4};
    }

    public gqg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
    }

    public gqg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
    }

    public gqg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, char[] cArr) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.e = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.b = armfVar5;
    }

    public gqg(char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.i(true);
        a.c(true);
        a.d(true);
        a.b = new seo(8);
        a.a = "a2p_conversation_subscriptions.participant_id";
        a.e(true);
        a.c = new wsy();
        sfa sfaVar = new sfa(a.a());
        this.a = sfaVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.a = "a2p_conversation_subscriptions.conversation_toolstone_state";
        a2.c = new wsy();
        sfa sfaVar2 = new sfa(a2.a());
        this.d = sfaVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.a = "a2p_conversation_subscriptions.conversation_subscription_state";
        a3.c = new wsy();
        sfa sfaVar3 = new sfa(a3.a());
        this.e = sfaVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "a2p_conversation_subscriptions.last_action_timestamp";
        a4.c = new wsy();
        sfa sfaVar4 = new sfa(a4.a());
        this.c = sfaVar4;
        this.b = new sfa[]{sfaVar, sfaVar2, sfaVar3, sfaVar4};
    }

    public gqg(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "cms_backup_dependency_cache_table._id";
        a.c = new wsy();
        sgk sgkVar = new sgk(a.a());
        this.c = sgkVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.i(true);
        a2.c(true);
        a2.a = "cms_backup_dependency_cache_table.dependent_id";
        a2.c = new wsy();
        sgk sgkVar2 = new sgk(a2.a());
        this.e = sgkVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.i(true);
        a3.c(true);
        a3.a = "cms_backup_dependency_cache_table.dependency_id";
        a3.c = new wsy();
        sgk sgkVar3 = new sgk(a3.a());
        this.b = sgkVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.i(true);
        a4.c(true);
        a4.a = "cms_backup_dependency_cache_table.inserted_at_timestamp";
        a4.c = new wsy();
        sgk sgkVar4 = new sgk(a4.a());
        this.d = sgkVar4;
        this.a = new sgk[]{sgkVar, sgkVar2, sgkVar3, sgkVar4};
    }

    public gqg(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "cms_media_notifications._id";
        a.c = new wsy();
        shu shuVar = new shu(a.a());
        this.c = shuVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.c(true);
        a2.a = "cms_media_notifications.message_cms_id";
        a2.c = new wsy();
        shu shuVar2 = new shu(a2.a());
        this.d = shuVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "cms_media_notifications.blob_id";
        a3.c = new wsy();
        shu shuVar3 = new shu(a3.a());
        this.b = shuVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.a = "cms_media_notifications.blob_type";
        a4.c = new wsy();
        shu shuVar4 = new shu(a4.a());
        this.e = shuVar4;
        this.a = new shu[]{shuVar, shuVar2, shuVar3, shuVar4};
    }
}
