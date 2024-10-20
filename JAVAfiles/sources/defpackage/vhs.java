package defpackage;

import android.app.Notification;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vhs implements vhv {
    public static final /* synthetic */ int e = 0;
    public final yhu a;
    public final vhu b;
    public final String c;
    public final Optional d;

    public vhs(yhu yhuVar, vhu vhuVar, String str, vin vinVar) {
        this.a = yhuVar;
        this.b = vhuVar;
        this.c = str;
        this.d = Optional.ofNullable(vinVar);
    }

    @Override // defpackage.vhv
    public final /* synthetic */ int a() {
        return vom.l(this);
    }

    @Override // defpackage.vhv
    public final Notification b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.vhv
    public final vhu c() {
        return this.b;
    }

    @Override // defpackage.vhv
    public final String e() {
        return null;
    }
}
