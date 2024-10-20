package com.google.android.apps.messaging.ui.debug;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import com.google.android.apps.messaging.R;
import defpackage.aagi;
import defpackage.aajk;
import defpackage.aajl;
import defpackage.aajm;
import defpackage.aajn;
import defpackage.aame;
import defpackage.akbo;
import defpackage.akbp;
import defpackage.alog;
import defpackage.alpt;
import defpackage.aluq;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.armf;
import defpackage.atsg;
import defpackage.cj;
import defpackage.eoy;
import defpackage.ivf;
import defpackage.yep;
import defpackage.yes;
import defpackage.zof;
import defpackage.zoz;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DebugGServiceKeysFragment extends aame {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/debug/DebugGServiceKeysFragment");
    public Button ag;
    public armf ah;
    public aajn ai;
    public armf aj;
    public armf ak;
    public zof al;
    private ListView am;
    public final akbp b = new akbp<Void, Void>() { // from class: com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            alvw i = DebugGServiceKeysFragment.a.i();
            i.X(alwp.a, "BugleDiagnostics");
            ((alvg) ((alvg) ((alvg) i).g(th)).h("com/google/android/apps/messaging/ui/debug/DebugGServiceKeysFragment$1", "onFailure", 'E', "DebugGServiceKeysFragment.java")).q("Failed to flush auto ramp local overrides.");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final akbp c = new aajk(this);
    public aajm d;
    public View e;

    public static Optional a(String str) {
        if (str.startsWith("@")) {
            return Optional.of(str.substring(1));
        }
        return Optional.empty();
    }

    public static alog d(atsg atsgVar) {
        ArrayList arrayList = new ArrayList(yes.a().keySet());
        aluq listIterator = ((alpt) atsgVar.d).listIterator();
        while (listIterator.hasNext()) {
            arrayList.add("@".concat(String.valueOf((String) listIterator.next())));
        }
        return alog.D(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [armf, java.lang.Object] */
    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.gservicekeys_debug_fragment, viewGroup, false);
        this.e = inflate;
        int i = 10;
        inflate.setOnApplyWindowInsetsListener(new ivf(i));
        this.am = (ListView) this.e.findViewById(android.R.id.list);
        ((SearchView) this.e.findViewById(R.id.search_bar)).setOnQueryTextListener(new aajl(this));
        zof zofVar = this.al;
        aagi aagiVar = new aagi(this, i);
        cj fe = fe();
        fe.getClass();
        yep yepVar = (yep) zofVar.b.b();
        yepVar.getClass();
        atsg atsgVar = (atsg) zofVar.a.b();
        atsgVar.getClass();
        aajm aajmVar = new aajm(yepVar, atsgVar, aagiVar, fe);
        this.d = aajmVar;
        this.am.setAdapter((ListAdapter) aajmVar);
        aajn aajnVar = this.ai;
        alog alogVar = this.d.a;
        alogVar.getClass();
        aajnVar.a = alogVar;
        Button button = (Button) this.e.findViewById(R.id.btn_dump_keys);
        this.ag = button;
        button.setOnClickListener(new zoz(this, String.valueOf(this.e.getContext().getCacheDir()) + File.separator + "autorampflags.txt", 11));
        return this.e;
    }

    @Override // defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        ((akbo) this.ah.b()).b(this.b);
        ((akbo) this.ah.b()).b(this.c);
        this.ai = (aajn) new eoy(this).a(aajn.class);
    }
}
