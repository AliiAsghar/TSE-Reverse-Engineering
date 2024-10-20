package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywf {
    public static final alor a;
    public final armf b;

    static {
        alok alokVar = new alok();
        alokVar.h("/bugle/rpc/update_data/", 1);
        alokVar.h("/bugle/rpc/call_contact/", 2);
        alokVar.h("/bugle/rpc/send_message/", 3);
        alokVar.h("/bugle/rpc/create_conversation/", 4);
        alokVar.h("/bugle/rpc/mark_as_read/", 5);
        alokVar.h("/bugle/rpc/open_conversation/", 6);
        alokVar.h("/bugle/rpc/resend_message/", 7);
        alokVar.h("/bugle/rpc/delete_message/", 8);
        alokVar.h("/bugle/rpc/download_message/", 9);
        alokVar.h("/bugle/rpc/delete_conversation/", 10);
        alokVar.h("/bugle/rpc/request_more_messages/", 11);
        alokVar.h("/bugle/rpc/more_messages/", 12);
        a = alokVar.b();
    }

    public ywf(armf armfVar) {
        this.b = armfVar;
    }

    @Deprecated
    public final void a(String str) {
        ((mbl) this.b.b()).e("Bugle.Wear.Rpc.Incoming.Count", ((Integer) a.getOrDefault(str, 0)).intValue());
    }
}
