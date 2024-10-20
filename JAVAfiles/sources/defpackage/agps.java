package defpackage;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agps {
    protected Map b;
    protected final String c;
    public final agpt e;
    public final ContentValues a = new ContentValues();
    protected final alob d = new alob();

    /* JADX INFO: Access modifiers changed from: protected */
    public agps(String str) {
        this.c = str;
        agpt agptVar = new agpt();
        agptVar.e(false);
        agptVar.f(agnc.c.c());
        agptVar.d(false);
        agptVar.b = "main";
        agptVar.g();
        agptVar.b = "$primary";
        agptVar.a = agni.a;
        this.e = agptVar;
    }

    private final agnw b() {
        return agnc.d(this.e.a().e);
    }

    public final int Y(agpw agpwVar, String str) {
        if (this.d.g().isEmpty()) {
            this.d.h(agpwVar);
            aj(str);
            return a().q(b(), agpo.b());
        }
        throw new IllegalStateException("don't combine updateFor and custom where");
    }

    public final void Z(agpw agpwVar) {
        this.d.h(agpwVar);
    }

    public abstract agpr a();

    public final void aa(String str, agpj agpjVar) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(str, agpjVar);
    }

    public final void ab() {
        this.e.d(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ac() {
        this.e.a();
    }

    public final void ad(agmh agmhVar) {
        this.a.remove(agmhVar.d());
    }

    public final boolean ae(agpw agpwVar, String str) {
        if (this.d.g().isEmpty()) {
            this.d.h(agpwVar);
            aj(str);
            if (a().q(b(), agpo.b()) != 0) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("don't combine updateFor and custom where");
    }

    public final void af() {
        this.e.e(true);
    }

    public final void ag() {
        this.e.f(false);
    }

    public final void ah() {
        this.e.f(true);
    }

    public final void ai(agni agniVar) {
        this.e.a = agniVar;
    }

    public final void aj(String str) {
        ai(new agni(str));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof agps) && this.a.equals(((agps) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
