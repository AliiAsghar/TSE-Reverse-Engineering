package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface yea {
    public static final String a = (String) ydz.a.e();

    @atrs(a = "v1/registershare")
    ListenableFuture<yen> a(@atrx(a = "key") String str, @atrx(a = "id") String str2, @atrx(a = "q") String str3, @atrx(a = "locale") String str4);

    @atrj(a = "v1/search")
    ListenableFuture<yeo> b(@atrx(a = "key") String str, @atrx(a = "q") String str2, @atrx(a = "limit") int i, @atrx(a = "locale") String str3, @atrx(a = "contentfilter") String str4);
}
