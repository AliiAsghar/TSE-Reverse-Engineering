package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjz extends arpw implements arqw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ jkt c;
    final /* synthetic */ jjp d;
    final /* synthetic */ nei e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjz(nei neiVar, jkt jktVar, jjp jjpVar, arpe arpeVar) {
        super(3, arpeVar);
        this.e = neiVar;
        this.c = jktVar;
        this.d = jjpVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        jjz jjzVar = new jjz(this.e, this.c, this.d, (arpe) obj3);
        jjzVar.a = (String) obj;
        jjzVar.b = obj2;
        return jjzVar.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [owm, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aerb aerbVar;
        aqil.P(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        aerb i = this.e.i();
        aron aronVar = new aron((byte[]) null);
        nei neiVar = this.e;
        if (neiVar.e.a() && (obj3 instanceof agdb)) {
            if (((ansy) ((owd) neiVar.a).a.b()).e("bugle.direct_send_v2_update_settings_photo_camera_icon_to_v2")) {
                aerbVar = aerb.cR;
            } else {
                aerbVar = aerb.cQ;
            }
            jkt jktVar = this.c;
            String string = ((Context) neiVar.d).getString(R.string.tune_button_content_description);
            string.getClass();
            aronVar.add(new agcy(aerbVar, string, jktVar.a));
        }
        return new jka((String) obj2, i, aqjn.x(aronVar));
    }
}
