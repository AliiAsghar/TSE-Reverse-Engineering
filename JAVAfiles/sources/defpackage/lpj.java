package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpj {
    public static final xze a = xze.g("Bugle", "NotificationSettingsFragmentPeer");
    public final lph b;
    public final akbo c;
    public final akvf d;
    public final Optional e;
    public final mho f;
    public final yhu g;
    public final akbp h = new akbp<Boolean, Void>() { // from class: lpj.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            lpj.this.j.ifPresent(new leq((Boolean) obj, 6));
            lpj.this.j.ifPresent(new ldx(2));
            lpj.a.m("Failed to save reminder action setting");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            lpj.this.j.ifPresent(new ldx(4));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            lpj.this.j.ifPresent(new ldx(3));
        }
    };
    public final akbp i = new akbp<Void, Void>() { // from class: lpj.2
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            lpj.a.m("Failed to enable default notification");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", ((Context) lpj.this.m.a).getPackageName());
            lpj lpjVar = lpj.this;
            lpjVar.k = lpjVar.g.e();
            lpj.this.b.startActivityForResult(intent, 1001);
        }
    };
    public Optional j;
    public NotificationChannel k;
    public final zxy l;
    public final znj m;

    public lpj(lph lphVar, akbo akboVar, akvf akvfVar, Optional optional, mho mhoVar, znj znjVar, yhu yhuVar, zxy zxyVar) {
        this.b = lphVar;
        this.c = akboVar;
        this.d = akvfVar;
        this.f = mhoVar;
        this.m = znjVar;
        this.g = yhuVar;
        this.e = optional;
        this.l = zxyVar;
    }

    public final Optional a(int i) {
        lph lphVar = this.b;
        return Optional.ofNullable(lphVar.a(lphVar.S(i)));
    }
}
