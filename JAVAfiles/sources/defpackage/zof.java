package defpackage;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.appsettings.verifiedsms.VerifiedSmsSettingsActivity;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zof {
    public final Object a;
    public final Object b;

    public zof(Activity activity, Optional optional) {
        this.b = activity;
        this.a = optional;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul a(ConversationId conversationId) {
        akrh e = aktp.e("AddContactBanner2DatabaseOperationsImpl#getConversationOpenCount");
        try {
            akul ai = aktp.ai(new yxs(this, conversationId, 15), this.b);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final EditText b(int i) {
        kn knVar = new kn((Context) this.b);
        knVar.setInputType(i);
        knVar.setSingleLine(false);
        return knVar;
    }

    public final TextView c(String str) {
        Context context = (Context) this.b;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setText(str);
        appCompatTextView.setPadding(32, 8, 0, 0);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setTextColor(ahnz.f(context, R.attr.colorOnBackground, "DebugCommandViews"));
        return appCompatTextView;
    }

    public final View d() {
        Context context = (Context) this.b;
        int applyDimension = (int) TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, applyDimension));
        return view;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final zxy e(MessageIdType messageIdType) {
        xwr xwrVar = (xwr) this.b.b();
        xwrVar.getClass();
        msk mskVar = (msk) this.a.b();
        mskVar.getClass();
        messageIdType.getClass();
        return new zxy(xwrVar, mskVar, messageIdType);
    }

    public zof(armf armfVar, aneo aneoVar) {
        this.a = armfVar;
        this.b = aneoVar;
    }

    public zof(VerifiedSmsSettingsActivity verifiedSmsSettingsActivity, ksm ksmVar) {
        this.a = verifiedSmsSettingsActivity;
        this.b = ksmVar;
    }

    public zof(xvy xvyVar, ConversationMessageView conversationMessageView) {
        this.b = xvyVar;
        this.a = conversationMessageView;
    }

    public zof(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public zof(arpi arpiVar, aaoc aaocVar) {
        arpiVar.getClass();
        aaocVar.getClass();
        this.a = arpiVar;
        this.b = aaocVar;
    }

    public zof(uie uieVar, armf armfVar) {
        uieVar.getClass();
        armfVar.getClass();
        this.a = uieVar;
        this.b = armfVar;
    }

    public zof(armf armfVar, armf armfVar2, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }
}
