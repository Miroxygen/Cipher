package model;


/**
 * A chiffer for encryption.
 */
public interface Chiffer {

  /**
   * Encodes a plaintext.
   */
  public void encode();

  /**
   * Decodes a plaintext.
   */
  public void decode();
}