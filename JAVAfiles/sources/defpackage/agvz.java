package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerLayoutManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvz implements AutoCloseable {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController");
    public final agvx A;
    public final int B;
    public final agwk C;
    private final anen D;
    private final agwq E;
    private final View.OnClickListener F;
    private final agvv G;
    public final Context b;
    public final agvx c;
    public final agwm d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final alog h;
    public final AtomicReference i;
    public final alog j;
    public final Optional k;
    public final agvb l;
    public final aguz m;
    public final AtomicBoolean n;
    public final boolean o;
    public final Optional p;
    public int q;
    public int r;
    public final agxe s;
    public boolean t;
    public boolean u;
    public final RecyclerView v;
    public final EmojiPickerBodyRecyclerView w;
    public agwf x;
    public agvr y;
    public float z;

    public agvz(RecyclerView recyclerView, EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView, agvx agvxVar, agwm agwmVar, agwc agwcVar) {
        int i;
        int i2;
        AtomicReference atomicReference = new AtomicReference();
        this.i = atomicReference;
        this.n = new AtomicBoolean(false);
        this.q = -1;
        this.r = 1;
        this.z = 1.0f;
        agvu agvuVar = new agvu(this, 0);
        this.A = agvuVar;
        this.G = new agvv(this);
        this.F = new agrb(this, 8, null);
        float f = agwmVar.a;
        if (f < brg.a && agwmVar.b == 0) {
            throw new IllegalArgumentException("Must provide either row count or row height.");
        }
        int i3 = agwmVar.e;
        if (f > brg.a && agwmVar.d == 0) {
            i = ((int) Math.ceil(f)) * i3;
        } else {
            i = agwmVar.d;
        }
        if (i > 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(emojiPickerBodyRecyclerView.getContext(), R.style.EmojiPicker);
            this.b = contextThemeWrapper;
            this.c = agvxVar;
            this.d = agwmVar;
            this.v = recyclerView;
            this.w = emojiPickerBodyRecyclerView;
            anen anenVar = agwcVar.f;
            this.D = anenVar == null ? agtj.a().d : anenVar;
            this.p = agwcVar.h;
            this.o = agwcVar.g;
            float f2 = agwmVar.a;
            if (f2 > brg.a && agwmVar.c == 0) {
                i2 = ((int) Math.floor(f2)) * agwmVar.e;
            } else {
                i2 = agwmVar.c;
            }
            this.e = i2;
            this.f = agwmVar.h;
            this.g = agwcVar.d;
            agva agvaVar = agwcVar.e;
            if (agvaVar != null) {
                this.l = agvaVar;
                this.m = agvaVar.a();
            } else {
                aguh aguhVar = new aguh(contextThemeWrapper);
                this.l = aguhVar;
                this.m = aguhVar.a;
            }
            agwk agwkVar = new agwk(contextThemeWrapper, agwmVar.i);
            this.C = agwkVar;
            agwkVar.c = new agrb(this, 9, null);
            this.s = agxg.instance.h;
            alog alogVar = agwcVar.b;
            if (alogVar == null || alogVar.isEmpty()) {
                agvh agvhVar = agwcVar.a;
                alogVar = alog.r(new agvm(contextThemeWrapper, new ahjj(emojiPickerBodyRecyclerView)));
            }
            this.h = alogVar;
            atomicReference.set((agvj) alogVar.get(0));
            alob alobVar = new alob();
            Optional optional = agwcVar.c;
            this.k = optional;
            optional.ifPresent(new adoj(alobVar, 20));
            this.j = alobVar.g();
            agvh agvhVar2 = agwcVar.a;
            int i4 = agwmVar.e;
            int i5 = agwmVar.d;
            oc ocVar = new oc();
            ocVar.f(agvn.a, i4);
            ocVar.f(agwn.a, i5);
            agvo agvoVar = new agvo(i4, ocVar, agvuVar);
            emojiPickerBodyRecyclerView.getContext();
            EmojiPickerLayoutManager emojiPickerLayoutManager = new EmojiPickerLayoutManager(agvoVar.a);
            emojiPickerLayoutManager.g = new agvs(emojiPickerBodyRecyclerView, agvoVar);
            emojiPickerBodyRecyclerView.aj(emojiPickerLayoutManager);
            emojiPickerBodyRecyclerView.ah(null);
            emojiPickerBodyRecyclerView.ak(agvoVar.b);
            emojiPickerBodyRecyclerView.ai(0);
            emojiPickerBodyRecyclerView.F = null;
            emojiPickerBodyRecyclerView.ad = new agvt(agvoVar.c);
            emojiPickerBodyRecyclerView.aL(emojiPickerBodyRecyclerView.ad);
            emojiPickerBodyRecyclerView.af(new agvy(this, emojiPickerBodyRecyclerView));
            this.B = agwmVar.m;
            recyclerView.aj(new LinearLayoutManager(0));
            recyclerView.af(new agvy(this, recyclerView));
            for (int i6 = 0; i6 < recyclerView.fX(); i6++) {
                recyclerView.ab(i6);
            }
            agwq agwqVar = new agwq(agwmVar);
            this.E = agwqVar;
            if (this.B == 1) {
                recyclerView.aJ(agwqVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid pool size.");
    }

    public static final int e(int i) {
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final agvj a() {
        if (this.h.isEmpty()) {
            ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "findNextEmojiProvider", 1101, "EmojiPickerController.java")).q("No recent emoji providers available. ");
            return null;
        }
        alog alogVar = this.h;
        if (((alsx) alogVar).c == 1) {
            return null;
        }
        int indexOf = alogVar.indexOf(this.i.get());
        alog alogVar2 = this.h;
        return (agvj) alogVar2.get((indexOf + 1) % ((alsx) alogVar2).c);
    }

    public final void b(agwg agwgVar) {
        agwf agwfVar = this.x;
        if (agwfVar != null) {
            agwfVar.c = agwgVar;
            agwfVar.p();
        }
    }

    public final void c(int i, int i2) {
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = this.w;
        if (emojiPickerBodyRecyclerView != null) {
            if (i < 0) {
                ((alvg) EmojiPickerBodyRecyclerView.ab.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "tryGoToCategory", 135, "EmojiPickerBodyRecyclerView.java")).r("Invalid categoryIndex: %s", i);
            } else {
                no noVar = emojiPickerBodyRecyclerView.l;
                boolean z = noVar instanceof agvr;
                nw nwVar = emojiPickerBodyRecyclerView.m;
                if (z && (nwVar instanceof GridLayoutManager)) {
                    agvr agvrVar = (agvr) noVar;
                    if (i >= agvrVar.H()) {
                        ((alvg) EmojiPickerBodyRecyclerView.ab.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "tryGoToCategory", 144, "EmojiPickerBodyRecyclerView.java")).u("Invalid categoryIndex: %s out of %s", i, agvrVar.H());
                    } else {
                        ((GridLayoutManager) nwVar).ad(agvrVar.G(i), 0);
                        emojiPickerBodyRecyclerView.ac = i;
                    }
                }
            }
        }
        this.A.a(i, i2);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        PopupWindow popupWindow;
        agwk agwkVar = this.C;
        if (agwkVar != null && (popupWindow = agwkVar.d) != null) {
            popupWindow.dismiss();
        }
        this.v.ag(null);
        this.x = null;
        while (this.v.fX() > 0) {
            this.v.ab(0);
        }
        this.v.aj(null);
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = this.w;
        emojiPickerBodyRecyclerView.A();
        emojiPickerBodyRecyclerView.ad = null;
        emojiPickerBodyRecyclerView.ag(null);
        while (emojiPickerBodyRecyclerView.fX() > 0) {
            emojiPickerBodyRecyclerView.ab(0);
        }
        this.y = null;
        try {
            alur it = this.h.iterator();
            while (it.hasNext()) {
                ((agvj) it.next()).close();
            }
            this.k.isPresent();
        } catch (Exception e) {
            ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "onDeactivate", (char) 572, "EmojiPickerController.java")).q("error when closing RecentItemProvider or ItemProvider");
        }
    }

    public final agvr d() {
        agvr agvrVar = this.y;
        if (agvrVar != null) {
            return agvrVar;
        }
        ((alvg) ((alvg) a.g()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "getBodyAdapter", 698, "EmojiPickerController.java")).q("getBodyAdapter(), loading emojis. ");
        Context context = this.b;
        agwm agwmVar = this.d;
        alog alogVar = this.j;
        alob alobVar = new alob();
        int[] iArr = aguf.b;
        for (int i = 0; i < 10; i++) {
            alobVar.h(context.getString(iArr[i]));
        }
        int i2 = ((alsx) alogVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            alobVar.h(((agvk) alogVar.get(i3)).c());
        }
        alog g = alobVar.g();
        agvv agvvVar = this.G;
        agvb agvbVar = this.l;
        aguz aguzVar = this.m;
        this.k.isPresent();
        agvr agvrVar2 = new agvr(context, agwmVar, g, agvvVar, agvbVar, aguzVar, new agud(this, 3), new agud(this, 4), new agqd(this, 7), new agqd(this, 6), this.F);
        agvrVar2.A(true);
        this.u = true;
        aguf agufVar = aguf.c;
        if (agufVar == null) {
            synchronized (aguf.class) {
                agufVar = aguf.c;
                if (agufVar == null) {
                    agufVar = new aguf();
                    aguf.c = agufVar;
                }
            }
        }
        Context context2 = this.b;
        anen anenVar = this.D;
        agxe agxeVar = this.s;
        aguz aguzVar2 = this.m;
        AtomicReference atomicReference = this.i;
        ListenableFuture b = agufVar.b(context2, anenVar, agxeVar);
        ListenableFuture z = aglo.z(aguzVar2, (agvj) atomicReference.get(), this.s, this.e, this.f, this.p);
        boolean z2 = this.g;
        ListenableFuture listenableFuture = aneh.a;
        if (z2) {
            listenableFuture = this.l.b();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(b);
        arrayList.add(z);
        arrayList.add(listenableFuture);
        albo.bR(albo.bV(arrayList).a(new agug(2), agtz.b), new aqxi(this, b, z, agvrVar2, 1), agtz.b);
        this.y = agvrVar2;
        return agvrVar2;
    }
}
