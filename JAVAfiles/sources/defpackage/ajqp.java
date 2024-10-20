package defpackage;

import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqp implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ajqp(int i) {
        this.a = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:372:0x0724. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0252  */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.util.Collection, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r20) {
        /*
            Method dump skipped, instructions count: 2164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajqp.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Message.MessageContent[i];
            case 1:
                return new Message[i];
            case 2:
                return new MessageClass[0];
            case 3:
                return new MessageExtensionHeader[i];
            case 4:
                return new MessageNotification[i];
            case 5:
                return new MessageReceipt[i];
            case 6:
                return new RcsDestinationId[i];
            case 7:
                return new SubjectExtension[i];
            case 8:
                return new TraceId[0];
            case 9:
                return new ajpb[i];
            case 10:
                return new ajpc[i];
            case 11:
                return new ajpd[0];
            case 12:
                return new ajpf[0];
            case 13:
                return new ajpg[0];
            case 14:
                return new ajpk[i];
            case 15:
                return new ajpl[i];
            case 16:
                return new ajpp[i];
            case 17:
                return new ajpo[i];
            case 18:
                return new ajpr[i];
            case 19:
                return new ajpu[i];
            default:
                return new ajpy[i];
        }
    }
}
