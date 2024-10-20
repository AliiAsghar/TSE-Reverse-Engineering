package defpackage;

import com.google.android.apps.messaging.R;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iuv implements akbp<Void, apdj<iur>> {
    private final cg a;

    public iuv(cg cgVar) {
        this.a = cgVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        if (th instanceof CancellationException) {
        } else {
            throw new IllegalStateException("Unable to send a reaction", th);
        }
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        String string;
        String str;
        apdj apdjVar = (apdj) obj2;
        apdjVar.getClass();
        int Z = a.Z(((iur) apdjVar.a(iur.a, aozs.a())).b);
        if (Z == 0) {
            Z = 1;
        }
        if (Z != 3) {
            int i = Z - 2;
            if (i != 2) {
                if (i != 3) {
                    if (Z != 2) {
                        if (Z != 3) {
                            if (Z != 4) {
                                if (Z != 5) {
                                    str = "UNRECOGNIZED";
                                } else {
                                    str = "FAIL_ENABLE_MMS_IN_GROUP";
                                }
                            } else {
                                str = "FAIL_MMS_UNAVAILABLE";
                            }
                        } else {
                            str = "SUCCESS";
                        }
                    } else {
                        str = "STATUS_UNSPECIFIED";
                    }
                    throw new IllegalStateException("Unexpected transport type selection status: ".concat(str));
                }
                string = this.a.y().getString(R.string.cant_send_group_mms_message_when_group_mms_is_disabled);
            } else {
                string = this.a.y().getString(R.string.mms_failure_outgoing_disabled);
            }
            string.getClass();
            aktp.K(new yyc(string, "", new eyg(4)), this.a);
        }
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
