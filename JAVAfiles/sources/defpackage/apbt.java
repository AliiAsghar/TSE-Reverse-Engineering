package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface apbt extends apbu {
    apca<? extends apbt> getParserForType();

    int getSerializedSize();

    apbs newBuilderForType();

    apbs toBuilder();

    byte[] toByteArray();

    aozb toByteString();

    void writeTo(aozl aozlVar);

    void writeTo(OutputStream outputStream);
}
