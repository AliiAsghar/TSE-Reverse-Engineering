package defpackage;

import com.google.android.ims.message.rbm.RbmSuggestionResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class myh implements myl {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public myh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.myr
    public final /* synthetic */ alog a() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.myr
    public final String b() {
        return this.b;
    }

    @Override // defpackage.myl
    public final String c() {
        return this.a;
    }

    @Override // defpackage.myr, defpackage.mym
    public final String j() {
        return RbmSuggestionResponse.CONTENT_TYPE;
    }
}
