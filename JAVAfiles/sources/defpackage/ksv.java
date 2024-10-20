package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksv implements ksq {
    private final Context a;
    private final /* synthetic */ int b;
    private final Object c;

    public ksv(Context context, anen anenVar, int i) {
        this.b = i;
        this.a = context;
        this.c = anenVar;
    }

    @Override // defpackage.ksq
    public final akul a() {
        if (this.b != 0) {
            return aktp.ag(new HashMap());
        }
        return aktp.ag(new HashMap());
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul b() {
        if (this.b != 0) {
            return uvl.b();
        }
        return uvl.b();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.uvn
    public final akul c() {
        if (this.b != 0) {
            Object obj = this.c;
            return aktp.ai(new kva(obj, 10), ((mel) obj).a);
        }
        return aktp.ai(new kli(3), this.c);
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul d() {
        if (this.b != 0) {
            return uvl.d();
        }
        return uvl.d();
    }

    @Override // defpackage.ksq
    public final ameg e() {
        if (this.b != 0) {
            return ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_MESSAGES_STATUS_HISTORY;
        }
        return ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_UNREDACTED_PHONE_NUMBERS;
    }

    @Override // defpackage.ksq
    public final String f() {
        if (this.b != 0) {
            return this.a.getString(R.string.messages_status_feedback_data_description);
        }
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_description);
    }

    @Override // defpackage.ksq
    public final String g() {
        if (this.b != 0) {
            return this.a.getString(R.string.messages_status_feedback_data_detail_title);
        }
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_detail_title);
    }

    @Override // defpackage.ksq
    public final String h() {
        if (this.b != 0) {
            return this.a.getString(R.string.messages_status_feedback_data_name);
        }
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_name);
    }

    @Override // defpackage.ksq
    public final String i() {
        if (this.b != 0) {
            return this.a.getString(R.string.messages_status_feedback_data_rationale);
        }
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_rationale);
    }

    @Override // defpackage.ksq
    public final String j() {
        if (this.b != 0) {
            return this.a.getString(R.string.messages_status_feedback_data_rationale_title);
        }
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_rationale_title);
    }

    public ksv(mel melVar, Context context, int i) {
        this.b = i;
        this.c = melVar;
        this.a = context;
    }
}
