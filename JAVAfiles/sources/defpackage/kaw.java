package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kaw implements jzy {
    public final Context a;
    public final lre b;

    public kaw(Context context, lre lreVar) {
        context.getClass();
        lreVar.getClass();
        this.a = context;
        this.b = lreVar;
    }

    @Override // defpackage.jzy
    public final /* bridge */ /* synthetic */ aetv a(kaa kaaVar) {
        kax kaxVar = (kax) kaaVar;
        String string = this.a.getString(R.string.message_bubble_satellite_failure_media);
        string.getClass();
        String str = kaxVar.b;
        return new aeki(new aejg(string, this.a.getString(R.string.message_bubble_more_info_subtitle), str), new aekh((byte[]) null), str, kaxVar.a, new kav(this, 0), 32);
    }
}
