package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahae implements SharedPreferences.Editor {
    private final Context a;
    private final String b;
    private final ArrayList c = new ArrayList();
    private boolean d = false;

    public ahae(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final synchronized void a() {
        this.c.clear();
        this.d = true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        albo.bM(new aaze(this, 17), agtj.a().e);
    }

    public final synchronized void b(String str, boolean z) {
        aozy createBuilder = ahai.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ahai ahaiVar = (ahai) apagVar;
        str.getClass();
        ahaiVar.b |= 1;
        ahaiVar.e = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ArrayList arrayList = this.c;
        ahai ahaiVar2 = (ahai) createBuilder.b;
        ahaiVar2.c = 2;
        ahaiVar2.d = Boolean.valueOf(z);
        arrayList.add((ahai) createBuilder.s());
    }

    public final synchronized void c(String str, float f) {
        aozy createBuilder = ahai.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ahai ahaiVar = (ahai) apagVar;
        str.getClass();
        ahaiVar.b |= 1;
        ahaiVar.e = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ArrayList arrayList = this.c;
        ahai ahaiVar2 = (ahai) createBuilder.b;
        ahaiVar2.c = 5;
        ahaiVar2.d = Float.valueOf(f);
        arrayList.add((ahai) createBuilder.s());
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        a();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    @Override // android.content.SharedPreferences.Editor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean commit() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahae.commit():boolean");
    }

    public final synchronized void d(String str, int i) {
        aozy createBuilder = ahai.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ahai ahaiVar = (ahai) apagVar;
        str.getClass();
        ahaiVar.b |= 1;
        ahaiVar.e = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ArrayList arrayList = this.c;
        ahai ahaiVar2 = (ahai) createBuilder.b;
        ahaiVar2.c = 3;
        ahaiVar2.d = Integer.valueOf(i);
        arrayList.add((ahai) createBuilder.s());
    }

    public final synchronized void e(String str, long j) {
        aozy createBuilder = ahai.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ahai ahaiVar = (ahai) apagVar;
        str.getClass();
        ahaiVar.b |= 1;
        ahaiVar.e = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ArrayList arrayList = this.c;
        ahai ahaiVar2 = (ahai) createBuilder.b;
        ahaiVar2.c = 4;
        ahaiVar2.d = Long.valueOf(j);
        arrayList.add((ahai) createBuilder.s());
    }

    public final synchronized void f(String str) {
        aozy createBuilder = ahai.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ArrayList arrayList = this.c;
        ahai ahaiVar = (ahai) createBuilder.b;
        str.getClass();
        ahaiVar.b |= 1;
        ahaiVar.e = str;
        arrayList.add((ahai) createBuilder.s());
    }

    public final synchronized void g(String str, String str2) {
        if (str2 == null) {
            f(str);
            return;
        }
        ArrayList arrayList = this.c;
        aozy createBuilder = ahai.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ahai ahaiVar = (ahai) apagVar;
        str.getClass();
        ahaiVar.b |= 1;
        ahaiVar.e = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ahai ahaiVar2 = (ahai) createBuilder.b;
        ahaiVar2.c = 6;
        ahaiVar2.d = str2;
        arrayList.add((ahai) createBuilder.s());
    }

    public final synchronized void h(String str, Set set) {
        if (set == null) {
            f(str);
            return;
        }
        ArrayList arrayList = this.c;
        aozy createBuilder = ahai.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ahai ahaiVar = (ahai) createBuilder.b;
        str.getClass();
        ahaiVar.b |= 1;
        ahaiVar.e = str;
        aozy createBuilder2 = ahaq.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ahaq ahaqVar = (ahaq) createBuilder2.b;
        apax apaxVar = ahaqVar.b;
        if (!apaxVar.c()) {
            ahaqVar.b = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(set, ahaqVar.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ahai ahaiVar2 = (ahai) createBuilder.b;
        ahaq ahaqVar2 = (ahaq) createBuilder2.s();
        ahaqVar2.getClass();
        ahaiVar2.d = ahaqVar2;
        ahaiVar2.c = 7;
        arrayList.add((ahai) createBuilder.s());
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        b(str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        c(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        d(str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        e(str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        g(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        h(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        f(str);
        return this;
    }
}
