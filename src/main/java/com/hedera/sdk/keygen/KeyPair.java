package com.hedera.sdk.keygen;

public interface KeyPair {
    byte[] getPrivateKey();
    byte[] getPublicKey();
    byte[] getPublicKeyEncoded();
    byte[] signMessage(byte[] message);
    boolean verifySignature(byte[] message, byte[] signature);
}
