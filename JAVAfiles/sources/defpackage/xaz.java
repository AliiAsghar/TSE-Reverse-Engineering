package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xaz {
    public final long a;
    public final ArrayList b;
    public String c;
    public String d;
    public String e;
    public int f;
    public final boolean g;
    public wyj h;

    public xaz(long j, Collection collection, boolean z) {
        collection.getClass();
        this.a = j;
        this.b = new ArrayList(collection);
        this.f = 0;
        this.g = z;
    }

    public static xaz a(xhv xhvVar, List list, String str, String str2, String str3) {
        xaz xazVar = new xaz(yyb.cE(xhvVar), list, false);
        xazVar.c = str;
        xazVar.d = str2;
        xazVar.e = str3;
        xazVar.f = 4;
        return xazVar;
    }

    public static xaz c(xhv xhvVar, List list, wyj wyjVar) {
        xaz xazVar = new xaz(yyb.cE(xhvVar), list, false);
        xazVar.h = wyjVar;
        return xazVar;
    }

    public final List b() {
        return this.b;
    }
}
