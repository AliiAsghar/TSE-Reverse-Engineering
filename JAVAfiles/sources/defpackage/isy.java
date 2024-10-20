package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.message.MessageDetails;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class isy implements akbp<Void, MessageDetails> {
    final /* synthetic */ itb a;

    public isy(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        xzb.i("Bugle", th, "Unable to show message details dialog");
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        MessageDetails messageDetails = (MessageDetails) obj2;
        String str = messageDetails.b;
        itb itbVar = this.a;
        cj F = itbVar.f.F();
        if (!TextUtils.isEmpty(str)) {
            View inflate = LayoutInflater.from(F).inflate(R.layout.message_details_dialog_view, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.message);
            textView.setText(messageDetails.b);
            textView.setContentDescription(messageDetails.c);
            textView.setTextIsSelectable(true);
            inflate.findViewById(R.id.container);
            MessageIdType messageIdType = messageDetails.a;
            inflate.findViewById(R.id.container);
            MessageIdType messageIdType2 = messageDetails.a;
            if (((Boolean) ktf.a.e()).booleanValue() && ((Boolean) ktf.c.e()).booleanValue()) {
                Object obj3 = itbVar.aS.a;
                View findViewById = inflate.findViewById(R.id.container);
                MessageIdType messageIdType3 = messageDetails.a;
                Button button = (Button) LayoutInflater.from(F).inflate(R.layout.advanced_feedback_launch_button, (ViewGroup) findViewById, true).findViewById(R.id.advanced_feedback_launch_button);
                if (button != null) {
                    button.setOnClickListener(new iix(obj3, F, 6, null));
                }
            }
            ajgi ajgiVar = new ajgi(F);
            ajgiVar.x(R.string.message_details_title);
            ajgiVar.z(inflate);
            ajgiVar.j(true);
            ajgiVar.a();
        }
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
