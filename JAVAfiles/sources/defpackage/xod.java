package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xod {
    public static final alvz a = new alvz("transfer_id", String.class, false, false);
    public static final alvz b = new alvz("transfer_handle", String.class, false, false);
    public static final alvz c = new alvz("num_redirects", Integer.class, false, false);
    public static final alvz d = new alvz("http_status_code", Integer.class, false, false);
    public static final alvz e = new alvz("bytes_uploaded", Long.class, false, false);
    public static final alvz f = new alvz("total_bytes", Long.class, false, false);
    public static final alvz g = new alvz("file_transfer_Event", FileTransferEvent.class, false, false);
    public static final alvz h;
    public static final alvz i;
    public static final alvz j;

    static {
        new alvz("content_type", String.class, false, false);
        h = new alvz("file_transfer_result", FileTransferResult.class, false, false);
        i = new alvz("in_progress_file_transfer_state", String.class, false, false);
        j = new alvz("file_processing_id", pyz.class, false, false);
    }
}
