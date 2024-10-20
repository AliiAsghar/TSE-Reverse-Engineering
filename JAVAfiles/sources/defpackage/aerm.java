package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aerm extends arrp implements arqr {
    final /* synthetic */ Integer a;
    final /* synthetic */ Integer b;
    final /* synthetic */ Uri c;
    final /* synthetic */ aerg d;
    final /* synthetic */ Duration e;
    final /* synthetic */ String f;
    final /* synthetic */ Uri g;
    final /* synthetic */ Uri h;
    final /* synthetic */ hts i;
    final /* synthetic */ ygv j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aerm(Integer num, Integer num2, Uri uri, aerg aergVar, Duration duration, String str, ygv ygvVar, Uri uri2, Uri uri3, hts htsVar) {
        super(1);
        this.a = num;
        this.b = num2;
        this.c = uri;
        this.d = aergVar;
        this.e = duration;
        this.f = str;
        this.j = ygvVar;
        this.g = uri2;
        this.h = uri3;
        this.i = htsVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Integer num;
        aerg aergVar;
        hlp hlpVar = (hlp) obj;
        hlpVar.getClass();
        Integer num2 = this.a;
        if (num2 != null && (num = this.b) != null) {
            Uri uri = this.c;
            if (uri != null && (aergVar = this.d) != null) {
                aergVar.a(uri, num2.intValue(), num.intValue());
            }
            hwu L = hlpVar.L(num2.intValue(), num.intValue());
            L.getClass();
            hlpVar = (hlp) L;
        }
        Duration duration = this.e;
        if (duration != null) {
            hwu G = hlpVar.G(duration.toNanos() / 1000);
            G.getClass();
            hlpVar = (hlp) G;
        }
        String str = this.f;
        if (str != null) {
            hwu P = hlpVar.P(new hyf(str));
            P.getClass();
            hlpVar = (hlp) P;
        }
        ygv ygvVar = this.j;
        Uri uri2 = this.g;
        if (uri2 != null) {
            ((alvg) ygv.a.d().h("com/google/android/apps/messaging/shared/util/media/image/TikTokGlideImageManager", "applyThumbnail", 45, "TikTokGlideImageManager.kt")).t("Applying thumbnail with uri: %s", uri2);
            hlp f = ygvVar.b.f(uri2);
            f.getClass();
            hwu Y = f.Y();
            Y.getClass();
            hlp hlpVar2 = (hlp) ((hlp) Y).L(Integer.MIN_VALUE, Integer.MIN_VALUE);
            hlpVar2.getClass();
            hlpVar = hlpVar.n(hlpVar2.a(null));
            hlpVar.getClass();
        }
        Uri uri3 = this.h;
        if (uri3 != null) {
            hlpVar = hlpVar.e(uri3);
            hlpVar.getClass();
        }
        Uri uri4 = this.c;
        aerg aergVar2 = this.d;
        if (aergVar2 != null) {
            aergVar2.c(uri4);
            hlpVar = hlpVar.a(new zpi(aergVar2, 2));
            hlpVar.getClass();
        }
        hts htsVar = this.i;
        if (htsVar != null) {
            hwu D = hlpVar.D(htsVar);
            D.getClass();
            return (hlp) D;
        }
        return hlpVar;
    }
}
