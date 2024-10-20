package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface wzs {
    public static final Uri a = Uri.parse("content://mms/part");
    public static final Uri b = Uri.parse("content://mms-sms/canonical-address");

    static {
        Uri.parse("content://mms-sms/threadID");
    }

    Optional A(xhv xhvVar);

    Optional B(xaz xazVar, String str);

    String C(long j);

    @Deprecated
    String D(xaz xazVar, String str);

    String E();

    @Deprecated
    String F(long j);

    String G(xhv xhvVar);

    String H();

    List I(String str);

    List J(String str);

    Map K();

    void L(Context context, Uri uri);

    void M(uj ujVar);

    void N(long j, long j2);

    @Deprecated
    void O(Uri uri, String str);

    void P(Uri uri, int i, long j);

    void Q(xhv xhvVar, boolean z);

    boolean R(long j, long j2);

    boolean S();

    boolean T(xhv xhvVar);

    boolean U(Context context, Uri uri, int i, long j);

    boolean V(Uri uri, String str);

    void W(List list);

    Uri X(Context context, gt gtVar, int i, String str, long j, long j2, String str2, int i2);

    void Y(long j, long j2);

    void Z(Uri uri);

    int a(Uri uri, String str);

    void aa(Context context, Uri uri, long j);

    vqh ab(Context context, Uri uri, gu guVar);

    boolean ac(Uri uri, int i, long j);

    void ad(Uri uri, long j);

    String[] ae(Context context, gj gjVar);

    void af();

    Uri ag(Context context, Uri uri, int i, String str, String str2, long j, int i2, int i3, xhv xhvVar, Optional optional);

    Uri ah(Context context, List list, MessageCoreData messageCoreData, aknw aknwVar, long j, int i, String str, long j2, byte[] bArr);

    gv ai(String[] strArr, MessageCoreData messageCoreData, aknw aknwVar, long j, int i, long j2, byte[] bArr);

    Uri aj(Context context, List list, MessageCoreData messageCoreData, aknw aknwVar, long j, int i, String str, long j2);

    int b(long j);

    int c(ContentResolver contentResolver, String str, String str2);

    long d(Context context, String str);

    long e(Context context, Collection collection);

    long f(Context context, wxs wxsVar, String str);

    long g(Context context, wxs wxsVar, Collection collection);

    long h(Context context, wxs wxsVar, String str, qqq qqqVar);

    long i(Context context, wxs wxsVar, Collection collection, qqq qqqVar);

    long j(long j, long j2);

    Uri k(Context context, gt gtVar, int i, String str, long j, long j2, String str2);

    Uri l(Context context, gj gjVar, int i, String str, long j, Map map);

    Uri m(ryg rygVar, MessageCoreData messageCoreData, long j);

    Uri n(ryg rygVar, MessageCoreData messageCoreData);

    vqh o(Context context, Uri uri, int i, String str, String str2, Uri uri2, boolean z, long j, Bundle bundle, long j2);

    vqh p(Context context, Uri uri, int i, String str, String str2, String str3, boolean z, long j, gt gtVar, long j2);

    vqh q(msh mshVar, String str, Uri uri, int i, String str2, boolean z, MessageIdType messageIdType, long j);

    wyb r(Uri uri, int i);

    wye s(Uri uri);

    wzr t(Uri uri);

    @Deprecated
    xaz u(long j, String str);

    xaz v(xhv xhvVar, String str);

    @Deprecated
    xaz w(wxs wxsVar, long j, String str);

    xaz x(wxs wxsVar, xhv xhvVar, String str);

    akul y();

    @Deprecated
    Optional z(long j);
}
