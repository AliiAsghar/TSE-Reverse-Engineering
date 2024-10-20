package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakc extends aamm {
    public static final alvi ag = alvi.m("com/google/android/apps/messaging/ui/debug/DebugSmsMmsFromDumpFileDialogFragment");
    public String ah;
    public woi ai;
    public aakd aj;
    public wyq ak;
    public armf al;
    public rdo am;
    private String[] an;

    @Override // defpackage.bw
    public final Dialog gM(Bundle bundle) {
        String[] strArr;
        Bundle bundle2 = this.m;
        Object serializable = bundle2.getSerializable("dump_files");
        if (serializable != null) {
            strArr = (String[]) serializable;
        } else {
            strArr = new String[0];
        }
        this.an = strArr;
        this.ah = bundle2.getString(GroupManagementRequest.ACTION_TAG);
        View inflate = fe().getLayoutInflater().inflate(R.layout.debug_sms_mms_from_dump_file_dialog, (ViewGroup) null);
        ((ListView) inflate.findViewById(R.id.dump_file_list)).setAdapter((ListAdapter) new aakb(this, fe(), this.an));
        AlertDialog.Builder builder = new AlertDialog.Builder(fe());
        Resources z = z();
        if ("load".equals(this.ah)) {
            builder.setTitle(z.getString(R.string.load_sms_mms_from_dump_file_dialog_title));
        } else if ("email".equals(this.ah)) {
            builder.setTitle(z.getString(R.string.email_sms_mms_from_dump_file_dialog_title));
        }
        builder.setView(inflate);
        return builder.create();
    }
}
