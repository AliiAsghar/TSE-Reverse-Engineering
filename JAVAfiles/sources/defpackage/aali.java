package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aali extends xzs {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ Activity a;
    final /* synthetic */ aalt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aali(aalt aaltVar, Activity activity) {
        super("Bugle.Async.DebugUtils.showUnreadMessagesDialog.Duration");
        this.a = activity;
        this.b = aaltVar;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        ((ykw) this.b.r.b()).h(this.a.getString(R.string.link_preview_tombstone_seen_pref_key), false);
        ((ykw) this.b.r.b()).k(this.a.getString(R.string.link_preview_tombstone_first_shown_millis_pref_key), -1L);
        new ssn().d();
        sxu sxuVar = new sxu();
        sxuVar.b(new aakq(18));
        sxuVar.d();
        return null;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        ((abbu) this.b.Z.b()).l("Link Previews reset to first view.");
    }
}
