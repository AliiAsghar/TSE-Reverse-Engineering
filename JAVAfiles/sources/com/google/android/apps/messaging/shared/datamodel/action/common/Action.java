package com.google.android.apps.messaging.shared.datamodel.action.common;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.agkx;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.amdy;
import defpackage.andi;
import defpackage.armf;
import defpackage.kli;
import defpackage.nhw;
import defpackage.nhy;
import defpackage.rbg;
import defpackage.rha;
import defpackage.rhe;
import defpackage.rhf;
import defpackage.rhi;
import defpackage.rhj;
import defpackage.rhk;
import defpackage.rhl;
import defpackage.rho;
import defpackage.rhs;
import defpackage.wng;
import defpackage.xnv;
import defpackage.xyl;
import defpackage.yyb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class Action<ResultT> implements Parcelable {
    private final armf c;
    public final armf s;
    public final String t;
    public final rhl u;
    public List v = new ArrayList();
    public rho w;
    public final amdy x;
    public final ArrayList y;
    public static final long r = TimeUnit.SECONDS.toMillis(6);
    private static final Object a = new Object();
    private static long b = -1;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        armf LF();

        armf LG();

        armf LX();

        xnv fN();
    }

    public Action(Bundle bundle, amdy amdyVar) {
        ArrayList arrayList;
        a aVar = (a) yyb.aL(a.class);
        this.s = aVar.LF();
        armf LG = aVar.LG();
        this.c = LG;
        this.t = h(getClass().getSimpleName(), aVar.fN());
        this.x = amdyVar;
        ActionParameters actionParameters = new ActionParameters(bundle);
        this.u = actionParameters;
        if (((nhw) LG.b()).a()) {
            arrayList = actionParameters.n("action_callstack_key", ParcelableStackTraceElement.class);
            if (arrayList == null) {
                arrayList = j();
            }
        } else {
            arrayList = null;
        }
        this.y = arrayList;
    }

    private static String h(String str, xnv xnvVar) {
        long j;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(":");
        synchronized (a) {
            long j2 = b;
            if (j2 == -1) {
                j2 = xnvVar.a() * 1000;
            }
            j = j2 + 1;
            b = j;
        }
        sb.append(j);
        return sb.toString();
    }

    private static ArrayList j() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        ArrayList arrayList = new ArrayList(stackTrace.length);
        for (int i = 0; i < stackTrace.length && i < 10; i++) {
            arrayList.add(new ParcelableStackTraceElement(stackTrace[i]));
        }
        return arrayList;
    }

    public static rhe o(List list, Throwable th) {
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[list.size()];
        for (int i = 0; i < list.size() && i < 10; i++) {
            ParcelableStackTraceElement parcelableStackTraceElement = (ParcelableStackTraceElement) list.get(i);
            stackTraceElementArr[i] = new StackTraceElement(parcelableStackTraceElement.a, parcelableStackTraceElement.b, parcelableStackTraceElement.c, parcelableStackTraceElement.d);
        }
        rhe rheVar = new rhe(th);
        rheVar.setStackTrace(stackTraceElementArr);
        return rheVar;
    }

    @Deprecated
    public void A(rhj rhjVar) {
        E(rhjVar);
    }

    public final void B(Action action) {
        rhj.b(this.t, new rhj(new rhf(), this));
        ((rhk) this.s.b()).h(this, action);
    }

    public final void C(Parcel parcel, int i) {
        parcel.writeString(this.t);
        parcel.writeParcelable(this.u.i(), i);
    }

    public final boolean D() {
        if (!this.v.isEmpty()) {
            return true;
        }
        return false;
    }

    public void E(rhj rhjVar) {
        rhj.b(this.t, rhjVar);
        ((rhk) this.s.b()).e(this);
    }

    public void F(long j) {
        ((rhk) this.s.b()).i(this, j);
    }

    public abstract akrh a();

    public Object b() {
        return null;
    }

    public abstract String c();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public akul e() {
        return aktp.ai(new rbg(this, 5), andi.a);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Action)) {
            return this.t.equals(((Action) obj).t);
        }
        return false;
    }

    public boolean fA() {
        return true;
    }

    public Bundle fw() {
        return null;
    }

    public akul fx() {
        return aktp.ai(new rbg(this, 6), andi.a);
    }

    public akul fy() {
        return aktp.ai(new kli(14), andi.a);
    }

    public Object fz(Bundle bundle) {
        return null;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final rhj p(rhi rhiVar) {
        rhj rhjVar = new rhj(rhiVar, this);
        E(rhjVar);
        return rhjVar;
    }

    public final akul q() {
        return ((rhk) this.s.b()).b(this);
    }

    public ListenableFuture r(wng wngVar) {
        armf armfVar = this.s;
        return ((rhk) armfVar.b()).c(this, wngVar, rho.a(this));
    }

    public final ListenableFuture s() {
        return ((rhk) this.s.b()).d(this);
    }

    public ListenableFuture t() {
        return ((rhk) this.s.b()).e(this);
    }

    public final String toString() {
        return String.valueOf(getClass()) + "-" + this.t;
    }

    public final Throwable u(Throwable th) {
        ArrayList arrayList = this.y;
        if (arrayList == null) {
            return th;
        }
        return o(arrayList, th);
    }

    public final void v() {
        this.v.add(this);
    }

    public void w(long j) {
        armf armfVar = this.s;
        ((rhk) armfVar.b()).g(this, rho.a(this), j);
    }

    public final void x(int i, long j) {
        ((rhk) this.s.b()).g(this, i, j);
    }

    public final void y(rho rhoVar) {
        if (rhoVar.d.contains(this)) {
            this.w = rhoVar;
            return;
        }
        throw new IllegalStateException("Call Job.addForegroundAction or Job.addBackgroundAction instead");
    }

    @Deprecated
    public final void z() {
        A(new rhj(new rhf(), this));
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public static final class ParcelableStackTraceElement implements Parcelable {
        public static final Parcelable.Creator<ParcelableStackTraceElement> CREATOR = new rha(2);
        public final String a;
        public final String b;
        public final String c;
        public final int d;

        public ParcelableStackTraceElement(Parcel parcel) {
            String readString = parcel.readString();
            this.a = readString == null ? "Unparcelling Error" : readString;
            String readString2 = parcel.readString();
            this.b = readString2 != null ? readString2 : "Unparcelling Error";
            this.c = parcel.readString();
            this.d = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
        }

        public ParcelableStackTraceElement(StackTraceElement stackTraceElement) {
            this.a = stackTraceElement.getClassName();
            this.b = stackTraceElement.getMethodName();
            this.c = stackTraceElement.getFileName();
            this.d = stackTraceElement.getLineNumber();
        }
    }

    public Action(Parcel parcel, amdy amdyVar) {
        ArrayList arrayList;
        a aVar = (a) yyb.aL(a.class);
        this.s = aVar.LF();
        armf LG = aVar.LG();
        this.c = LG;
        String readString = parcel.readString();
        readString.getClass();
        this.t = readString;
        xyl.f(agkx.ae(readString));
        this.x = amdyVar;
        try {
            rhl rhlVar = (ActionParameters) parcel.readParcelable(ActionParameters.class.getClassLoader());
            if (((nhy) aVar.LX().b()).a()) {
                if (rhlVar == null) {
                    rhlVar = new rhs();
                }
            } else if (rhlVar == null) {
                rhlVar = new ActionParameters();
            }
            this.u = rhlVar;
            if (((nhw) LG.b()).a()) {
                arrayList = rhlVar.n("action_callstack_key", ParcelableStackTraceElement.class);
                if (arrayList == null) {
                    arrayList = j();
                }
            } else {
                arrayList = null;
            }
            this.y = arrayList;
        } catch (BadParcelableException e) {
            xyl.p("Failed to unparcel action parameters", e);
            throw e;
        }
    }

    public Action(rhl rhlVar, String str, amdy amdyVar) {
        ArrayList arrayList;
        a aVar = (a) yyb.aL(a.class);
        this.s = aVar.LF();
        armf LG = aVar.LG();
        this.c = LG;
        this.t = str;
        this.x = amdyVar;
        this.u = rhlVar;
        if (((nhw) LG.b()).a()) {
            arrayList = rhlVar.n("action_callstack_key", ParcelableStackTraceElement.class);
            if (arrayList == null) {
                arrayList = j();
            }
        } else {
            arrayList = null;
        }
        this.y = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Action(amdy amdyVar) {
        a aVar = (a) yyb.aL(a.class);
        this.s = aVar.LF();
        armf LG = aVar.LG();
        this.c = LG;
        this.t = h(getClass().getSimpleName(), aVar.fN());
        this.x = amdyVar;
        if (((nhy) aVar.LX().b()).a()) {
            this.u = new rhs();
        } else {
            this.u = new ActionParameters();
        }
        if (!((nhw) LG.b()).a()) {
            this.y = null;
            return;
        }
        ArrayList j = j();
        this.y = j;
        this.u.u("action_callstack_key", j);
    }
}
