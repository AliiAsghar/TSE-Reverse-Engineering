package defpackage;

import java.util.ArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zhh implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ zhh(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                return (Boolean) ((utz) aagh.a.get()).e();
            case 1:
                return Boolean.valueOf(yig.e());
            case 2:
                return (Boolean) ((utz) yig.Q.get()).e();
            case 3:
                return new zkc();
            case 4:
                return new ArrayList();
            case 5:
                int i = alog.d;
                return alsx.a;
            case 6:
                int i2 = alog.d;
                return alsx.a;
            case 7:
                throw null;
            case 8:
                return arnv.a;
            case 9:
                return new ArrayList();
            case 10:
                int i3 = aall.c;
                return aalt.g();
            case 11:
                return new ArrayList();
            case 12:
                return new ArrayList();
            case 13:
                return new IllegalStateException("popupSimInfo should not be empty");
            case 14:
                return new IllegalStateException("popupSimInfo should not be empty");
            case 15:
                return new ArrayList();
            case 16:
                return new abef();
            case 17:
                advp advpVar = acno.d;
                advr.q("Trying to connect to conference with null uri", new Object[0]);
                return adqq.GROUP_ID;
            case 18:
                return new IllegalArgumentException("No session provided in request!");
            case 19:
                return new IllegalArgumentException("No message in request.");
            default:
                return new IllegalArgumentException("No Content-Type given!");
        }
    }
}
