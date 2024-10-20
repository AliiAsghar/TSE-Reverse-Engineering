package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gic {
    public final artf a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public gkf h;
    public boolean i;
    public boolean n;
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final ghw o = new ghw((char[]) null);
    public final Set j = new LinkedHashSet();
    public final Set k = new LinkedHashSet();
    public final List l = new ArrayList();
    public boolean m = true;

    public gic(Context context, Class cls, String str) {
        this.a = armd.f(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(gjk... gjkVarArr) {
        gjk gjkVar = gjkVarArr[0];
        this.k.add(Integer.valueOf(gjkVar.a));
        this.k.add(Integer.valueOf(gjkVar.b));
        gjk[] gjkVarArr2 = (gjk[]) Arrays.copyOf(gjkVarArr, 1);
        gjkVarArr2.getClass();
        for (gjk gjkVar2 : gjkVarArr2) {
            this.o.f(gjkVar2);
        }
    }
}
