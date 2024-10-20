package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnr extends abnn {
    public static final List m = new CopyOnWriteArrayList();
    public final List n;

    public abnr(Context context, String str, String str2) {
        this(context, str, str2, abon.a, null, new aboy(context, new abnl(3)), new abpa(context), new abnl(2), null);
    }

    public static abnr i(Context context, String str) {
        return l(context, str).a();
    }

    public static abnr j(Context context, String str) {
        return m(context, str).a();
    }

    public static void k(abnp abnpVar) {
        m.add(0, abnpVar);
    }

    public static abnm l(Context context, String str) {
        abnm abnmVar = new abnm(context, str);
        abnmVar.b(abon.b);
        return abnmVar;
    }

    public static abnm m(Context context, String str) {
        abnm abnmVar = new abnm(context, str);
        abnmVar.b(abon.c);
        return abnmVar;
    }

    @Deprecated
    public final abnq g(apbt apbtVar) {
        abhg.m(apbtVar);
        return new abnq(this, apbtVar);
    }

    public final abnq h(apbt apbtVar, abom abomVar) {
        abhg.m(apbtVar);
        abnq abnqVar = new abnq(this, apbtVar);
        abnqVar.q = abomVar;
        return abnqVar;
    }

    public abnr(Context context, String str, String str2, abon abonVar, apwa apwaVar, abns abnsVar, abol abolVar, alhr alhrVar, ahxe ahxeVar) {
        super(context, str, str2, abonVar, apwaVar, abnsVar, abolVar, alhrVar, ahxeVar);
        this.n = new CopyOnWriteArrayList();
    }
}
