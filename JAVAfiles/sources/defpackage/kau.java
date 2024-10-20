package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kau implements jzy {
    private final Context a;

    public kau(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.jzy
    public final /* bridge */ /* synthetic */ aetv a(kaa kaaVar) {
        aejt aejgVar;
        kat katVar = (kat) kaaVar;
        String j = katVar.a.j();
        j.getClass();
        lga.bE(j);
        if (gh.z(j)) {
            String string = this.a.getString(R.string.message_bubble_failure_video);
            string.getClass();
            aejgVar = new aejp(string, null, katVar.c, 6);
        } else if (gh.m(j)) {
            String string2 = this.a.getString(R.string.message_bubble_failure_image);
            string2.getClass();
            aejgVar = new aejl(string2, null, katVar.c, 6);
        } else {
            String string3 = this.a.getString(R.string.message_bubble_permanent_failure_media);
            string3.getClass();
            aejgVar = new aejg(string3, katVar.c);
        }
        return new aeki(aejgVar, new aekh((byte[]) null), katVar.c, katVar.b, (arqg) null, 48);
    }
}
