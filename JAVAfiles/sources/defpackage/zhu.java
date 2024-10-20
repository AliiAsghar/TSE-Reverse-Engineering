package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class zhu implements akgh<ajzb> {
    final /* synthetic */ Preference a;
    final /* synthetic */ zhw b;

    public zhu(zhw zhwVar, Preference preference) {
        this.a = preference;
        this.b = zhwVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        zhw.a.r("Error retrieving account", th);
        this.b.f.d().af(this.a);
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ajzb ajzbVar = (ajzb) obj;
        if (!qrl.a() && kpt.a() && !ajzbVar.i.equals("pseudonymous")) {
            try {
                cj fe = this.b.f.fe();
                fe.getClass();
                int applicationEnabledSetting = fe.getPackageManager().getApplicationEnabledSetting("com.google.android.apps.photos");
                if (applicationEnabledSetting == 0 || applicationEnabledSetting == 1) {
                    this.b.ap.c().ifPresent(new Consumer() { // from class: zht
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void q(Object obj2) {
                            zhu zhuVar = zhu.this;
                            Context context = zhuVar.b.f.d().j;
                            zhuVar.b.d.getClass();
                            ((zjl) obj2).a();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return;
                }
            } catch (IllegalArgumentException unused) {
                zhw.a.o("Photos app is not installed.");
            }
        }
        zhw zhwVar = this.b;
        zhwVar.f.d().af(this.a);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
