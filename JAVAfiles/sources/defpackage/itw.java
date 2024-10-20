package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itw implements mdz {
    private final /* synthetic */ int a;

    public itw(int i) {
        this.a = i;
    }

    @Override // defpackage.mdz
    public final amfp a() {
        switch (this.a) {
            case 0:
                return amfp.BUGLE_SELECTED_MESSAGES_ACTION;
            case 1:
                return amfp.BUGLE_CONTACT_PICKER;
            case 2:
                return amfp.MMS_METADATA_EXPERIMENT;
            case 3:
                return amfp.MULTI_SHARE_EVENT;
            case 4:
                return amfp.BUGLE_COMPOSE;
            case 5:
                return amfp.BUGLE_MEDIA_VIEWER;
            case 6:
                return amfp.BUGLE_STAR_EVENT;
            case 7:
                return amfp.BUGLE_MDD_LIB;
            case 8:
                return amfp.BUGLE_GROUP;
            case 9:
                return amfp.FORWARD_TELEPHONY_SYNC;
            case 10:
                return amfp.BUGLE_TRANSCODING;
            case 11:
                return amfp.SPAM_FOLDER_EVENT;
            case 12:
                return amfp.HADES_SDK_EVENT;
            default:
                return amfp.BUGLE_MESSAGE;
        }
    }

    @Override // defpackage.mdz
    public final BiConsumer b() {
        int i = 7;
        int i2 = 2;
        int i3 = 4;
        switch (this.a) {
            case 0:
                return new ijo(itv.a, 2);
            case 1:
                return new ijo(ijl.a, 0);
            case 2:
                return new ioe(i3);
            case 3:
                return new ijo(ljl.a, 3);
            case 4:
                return new ioe(12);
            case 5:
                return new meb(i3);
            case 6:
                return new meb(17);
            case 7:
                return new ijo(uzh.a, 4);
            case 8:
                return new vhg(i2);
            case 9:
                return new vhg(i);
            case 10:
                return new vhg(18);
            case 11:
                return new ijo(ync.a, 5);
            case 12:
                return new ijo(yqk.a, 6);
            default:
                return new ijo(yqy.a, 7);
        }
    }

    @Override // defpackage.mdz
    public final Supplier c() {
        int i = 3;
        int i2 = 0;
        switch (this.a) {
            case 0:
                return new ijk(i);
            case 1:
                return new ijk(i2);
            case 2:
                return new ijk(10);
            case 3:
                return new lct(19);
            case 4:
                return new mcw(1);
            case 5:
                return new mcw(i);
            case 6:
                return new mqr(13);
            case 7:
                return new uzg(i2);
            case 8:
                return new vtc(i2);
            case 9:
                return new wso(14);
            case 10:
                return new yaa(5);
            case 11:
                return new yaa(8);
            case 12:
                return new yaa(15);
            default:
                return new yaa(16);
        }
    }
}
