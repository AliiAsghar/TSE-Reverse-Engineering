package defpackage;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface rhl {
    byte[] A(String str);

    String[] B(String str);

    Bundle C();

    Duration D();

    Parcelable[] E();

    ArrayList F(ArrayList arrayList);

    ArrayList G();

    void H(Duration duration);

    void I(Parcelable[] parcelableArr);

    void J(ArrayList arrayList);

    int a(String str);

    int b(String str, int i);

    long d(String str);

    long e(String str, long j);

    BaseBundle f();

    @Deprecated
    Parcelable h(String str);

    ActionParameters i();

    Optional j();

    String l(String str);

    ArrayList m(String str);

    ArrayList n(String str, Class cls);

    void p(String str, boolean z);

    void q(String str, byte[] bArr);

    void r(String str, int i);

    void s(String str, long j);

    void t(String str, Parcelable parcelable);

    void u(String str, ArrayList arrayList);

    void v(String str, String str2);

    void w(String str, String[] strArr);

    boolean x(String str);

    boolean y(String str);

    boolean z(String str, boolean z);
}
